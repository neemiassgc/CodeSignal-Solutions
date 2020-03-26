/*Please add ; after each select statement*/
CREATE PROCEDURE localCalendar()
BEGIN
	SELECT e.event_id AS event_id, IF(
        s.hours = 24,
        DATE_FORMAT(
            DATE_ADD(e.date, INTERVAL s.timeshift MINUTE),
            "%Y-%m-%d %H:%i"
        ),
        DATE_FORMAT(
            DATE_ADD(e.date, INTERVAL s.timeshift MINUTE),
            "%Y-%m-%d %h:%i %p"
        )
    ) AS formatted_date FROM events AS e
    INNER JOIN settings AS s ON e.user_id = s.user_id
    ORDER BY event_id ASC;
END