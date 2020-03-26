/*Please add ; after each select statement*/
CREATE PROCEDURE routeLength()
BEGIN
	SELECT ROUND(
        SUM(
            ST_Distance(Point(c1.x, c1.y), Point(c2.x, c2.y))
        ), 9
    ) AS total
    FROM cities AS c1, cities AS c2
    WHERE c2.id = c1.id + 1;
END