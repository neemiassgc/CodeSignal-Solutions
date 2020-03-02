/*Please add ; after each select statement*/
CREATE PROCEDURE travelDiary()
BEGIN
    SELECT GROUP_CONCAT(
        DISTINCT country
        ORDER BY country ASC SEPARATOR ";"
    )
    AS countries FROM diary;
END