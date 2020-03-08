/*Please add ; after each select statement*/
CREATE PROCEDURE alarmClocks()
BEGIN
    SET @currentDate := (SELECT * FROM userInput);
    SET @endDate = CONCAT(YEAR(@currentDate), "-12-31 ", "23:59:59");
    WHILE DATE_ADD(@currentDate, INTERVAL 7 DAY) <= @endDate DO
        SET @currentDate := DATE_ADD(@currentDate, INTERVAL 7 DAY);
        INSERT INTO userInput (input_date) VALUES (@currentDate);
    END WHILE;
    SELECT input_date AS alarm_date
    FROM userInput ORDER BY alarm_date ASC;
END