CREATE PROCEDURE stringsStatistics()
BEGIN
	/* Write your SQL here. Terminate each statement with a semicolon. */
    DROP TABLE IF EXISTS letter;
    CREATE TABLE letter (
        id SMALLINT PRIMARY KEY AUTO_INCREMENT,
        value CHAR(1)
    );
    
    DROP TABLE IF EXISTS total;
    CREATE TABLE total (
        id SMALLINT PRIMARY KEY AUTO_INCREMENT,
        value SMALLINT
    );
    
    DROP TABLE IF EXISTS occurrence;
    CREATE TABLE occurrence (
        id SMALLINT PRIMARY KEY AUTO_INCREMENT,
        value SMALLINT
    );
    
    DROP TABLE IF EXISTS max_occurrence;
    CREATE TABLE max_occurrence (
        id SMALLINT PRIMARY KEY AUTO_INCREMENT,
        value SMALLINT
    );
    
    DROP TABLE IF EXISTS max_occurrence_reached;
    CREATE TABLE max_occurrence_reached (
        id SMALLINT PRIMARY KEY AUTO_INCREMENT,
        value SMALLINT
    );
    
    DROP TABLE IF EXISTS chars;
    CREATE TABLE chars (
        id SMALLINT PRIMARY KEY AUTO_INCREMENT,
        value CHAR(1)
    );
    
    SET @line := (SELECT GROUP_CONCAT(str SEPARATOR '') FROM strs);
    
    SET @i := 1;
    WHILE @i <= LENGTH(@line) DO
        INSERT INTO chars (value)
        SELECT (SELECT SUBSTRING(@line, @i, 1));
        SET @i = @i + 1;
    END WHILE;
    
    /*For letter*/
    INSERT INTO letter (value)
    SELECT value FROM chars GROUP BY value;
    
    /* For total */
    INSERT INTO total (value)
    SELECT COUNT(*) FROM chars GROUP BY value;
    
    /* For occurrence*/
    INSERT INTO occurrence (value) SELECT (
        SELECT COUNT(*) FROM strs WHERE str LIKE CONCAT(
            '%', l.value, '%'
        )
    ) FROM letter AS l;
    
    /* For max_occurrence*/
    INSERT INTO max_occurrence (value)
    SELECT (SELECT MAX(LENGTH(REGEXP_REPLACE(
            str, CONCAT("[^", l.value, "]"), ""
        ))) FROM strs
    ) AS 'max' FROM letter AS l;
    
    /* For max_occurrence_reached*/
    INSERT INTO max_occurrence_reached (value) SELECT (
        SELECT COUNT(*) FROM strs
        WHERE LENGTH(REGEXP_REPLACE(
            str, CONCAT("[^", l.value, "]"), ""
        )) = (
            SELECT MAX(LENGTH(REGEXP_REPLACE(
                str, CONCAT("[^", l.value, "]"), ""
            ))) AS m FROM strs
        )
    ) FROM letter AS l;

    SELECT l.value AS letter, t.value AS total,
    o.value AS occurrence, mo.value AS max_occurrence,
    mor.value AS max_occurrence_reached
    FROM letter AS l, total AS t, occurrence AS o,
    max_occurrence AS mo, max_occurrence_reached AS mor
    WHERE l.id = t.id && t.id = o.id && o.id = mo.id
    && mo.id = mor.id ORDER BY letter;
END