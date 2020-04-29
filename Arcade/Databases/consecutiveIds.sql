/*Please add ; after each select statement*/
CREATE PROCEDURE consecutiveIds()
BEGIN
    SET @uid := 0;
	SELECT id AS oldId, (@uid := @uid + 1) AS newId
    FROM itemIds ORDER BY oldId; 
END