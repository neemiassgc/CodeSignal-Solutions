CREATE PROCEDURE driversInfo()
BEGIN
	/* Write your SQL here. Terminate each statement with a semicolon. */
    DROP TABLE IF EXISTS names;
    CREATE TABLE names (
        id INT PRIMARY KEY AUTO_INCREMENT,
        name VARCHAR(100)
    );
    
    DROP TABLE IF EXISTS summary;
    CREATE TABLE summary (
        value VARCHAR(255)
    );
    
    INSERT INTO names (name)
    SELECT DISTINCT driver_name FROM inspections
    ORDER BY driver_name;
    
    INSERT INTO summary (value)
    SELECT CONCAT(
    ' Total miles driven by all drivers combined: ',
    SUM(miles_logged)) FROM inspections;
    
    SET @id := 1;
    WHILE (SELECT COUNT(*) FROM names WHERE id = @id) = 1 DO
        
        INSERT INTO summary (value)
        SELECT CONCAT(
            ' Name: ', driver_name,
            '; number of inspections: ', COUNT(driver_name),
            '; miles driven: ', SUM(miles_logged)
        ) FROM inspections WHERE driver_name =
        (SELECT name FROM names WHERE id = @id);
        
        INSERT INTO summary (value)
        SELECT CONCAT(
            '  date: ', date,
            '; miles covered: ', miles_logged
        ) FROM inspections WHERE driver_name =
        (SELECT name FROM names WHERE id = @id)
        ORDER BY date;
        
        SET @id := @id + 1;
    END WHILE;
    
    SELECT value AS summary FROM summary;
END