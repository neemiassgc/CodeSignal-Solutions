/*Please add ; after each select statement*/
CREATE PROCEDURE pastEvents()
BEGIN
    SELECT name, event_date FROM Events
    WHERE event_date BETWEEN DATE_SUB(
            (SELECT MAX(event_date) FROM Events), INTERVAL 7 DAY
        )
        AND DATE_SUB(
            (SELECT MAX(event_date) FROM Events), INTERVAL 1 DAY
        )
    ORDER BY event_date DESC;
END