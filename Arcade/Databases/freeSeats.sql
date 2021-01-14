CREATE PROCEDURE freeSeats()
BEGIN
	/* Write your SQL here. Terminate each statement with a semicolon. */
        
    SELECT f.flight_id,
    IFNULL(
    (
        SELECT (p.number_of_seats - c.value)
        FROM (
            SELECT flight_id, COUNT(flight_id) AS value
            FROM purchases GROUP BY flight_id
        ) AS c WHERE c.flight_id = f.flight_id
    ), p.number_of_seats) AS free_seats
    FROM flights AS f INNER JOIN planes AS p
    ON f.plane_id = p.plane_id ORDER BY flight_id;
END