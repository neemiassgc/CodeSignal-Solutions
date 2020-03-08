/*Please add ; after each select statement*/
CREATE PROCEDURE userCountries()
BEGIN
	SELECT u.id, IFNULL(c.country, "unknown") AS country
    FROM users AS u
    LEFT JOIN cities AS c ON u.city = c.city
    ORDER BY u.id ASC;
END