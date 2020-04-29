/*Please add ; after each select statement*/
CREATE PROCEDURE holidayEvent()
BEGIN
    SET @counter := 0;
    SELECT DISTINCT buyer_name AS winners FROM (
        SELECT buyer_name, (@counter := @counter + 1) AS counter
        FROM purchases
    ) AS t WHERE counter MOD 4 = 0 ORDER BY winners ASC;
END