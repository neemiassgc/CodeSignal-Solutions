CREATE PROCEDURE sortBookChapters()
BEGIN
	/* Write your SQL here. Terminate each statement with a semicolon. */
    SELECT chapter_name FROM book_chapters
    ORDER BY romanConverter(chapter_number);
END;

CREATE FUNCTION romanConverter (value VARCHAR(25)) RETURNS INT
BEGIN
    SET @accumulator := 0;
    SET @previous := 0;
    SET @i := LENGTH(value);
    
    WHILE @i >= 1 DO
        SET @v := findSymbol(SUBSTRING(value, @i, 1));
        SET @m := 0;
        
        IF @v < @previous THEN SET @m := -1;
        ELSE SET @m := 1;
        END IF;
        
        SET @accumulator := @accumulator + @v * @m;
        SET @previous := @v;
        
        SET @i = @i - 1;
    END WHILE;
    
    RETURN @accumulator;
END;

CREATE FUNCTION findSymbol (value CHAR(1)) RETURNS INT
BEGIN
    CASE value
        WHEN 'I' THEN RETURN 1;
        WHEN 'V' THEN RETURN 5;
        WHEN 'X' THEN RETURN 10;
        WHEN 'L' THEN RETURN 50;
        WHEN 'C' THEN RETURN 100;
        WHEN 'D' THEN RETURN 500;
        WHEN 'M' THEN RETURN 1000;
    END CASE;
END;