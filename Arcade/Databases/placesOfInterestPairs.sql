/*Please add ; after each select statement*/
CREATE PROCEDURE placesOfInterestPairs()
BEGIN
	SELECT s1.name AS place1, s2.name AS place2
    FROM sights AS s1, sights AS s2
    WHERE  ST_Distance(Point(s1.x, s1.y), Point(s2.x, s2.y)) < 5
    AND s1.name < s2.name ORDER BY place1 ASC, place2 ASC; 
END