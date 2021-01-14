CREATE PROCEDURE giftPackaging()
BEGIN
	/* Write your SQL here. Terminate each statement with a semicolon. */
    SELECT (
        SELECT package_type FROM packages
        WHERE g.length <= length AND g.width <= width AND g.height <= height
        ORDER BY (length * width * height) LIMIT 1
    ) AS package_type, COUNT(*) AS number
    FROM gifts AS g GROUP BY package_type ORDER BY package_type;
END