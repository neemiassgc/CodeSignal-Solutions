CREATE PROCEDURE queriesExecution()
BEGIN
	/* Write your SQL here. Terminate each statement with a semicolon. */
    DECLARE done BOOL DEFAULT FALSE;
    DECLARE s_code VARCHAR(2048) DEFAULT "";
    DECLARE q_cursor CURSOR FOR SELECT code FROM my_queries;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;
    SET @i = 0;
    
    DROP TABLE IF EXISTS my_queries;
    CREATE TABLE my_queries (
        id INT AUTO_INCREMENT PRIMARY KEY,
        query_name VARCHAR(2048),
        code VARCHAR(2048)
    );
    
    DROP TABLE IF EXISTS output;
    CREATE TABLE output (
        query_name VARCHAR(255),
        val VARCHAR(255)
    );
    
    INSERT INTO my_queries (query_name, code)
    SELECT query_name, code FROM queries;
    
    UPDATE my_queries SET code = REGEXP_REPLACE(
        code,
        "FROM",
        CONCAT("AS val FROM")
    );

    UPDATE my_queries SET code = REGEXP_REPLACE(
        code,
        "SELECT",
        CONCAT(
            "INSERT INTO output SELECT ",
            "(SELECT query_name FROM my_queries WHERE id = ", (@i := @i + 1),
            ") ", "AS query_name,"
        )
    );

    OPEN q_cursor;

    my_loop: LOOP
        FETCH q_cursor INTO s_code;
        
        IF done THEN
            LEAVE my_loop;
        END IF;
        
        SET @sql := s_code;
        PREPARE q FROM @sql;
        
        EXECUTE q;
        DEALLOCATE PREPARE q;
    END LOOP;

    CLOSE q_cursor;
    
    SELECT * FROM output;
END