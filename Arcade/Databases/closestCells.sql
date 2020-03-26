/*Please add ; after each select statement*/
CREATE PROCEDURE closestCells()
BEGIN
    SELECT l.id AS id1,
           (SELECT id 
                FROM positions r
                WHERE l.id != r.id
                ORDER BY ST_Distance(point(l.x, l.y), point(r.x, r.y)) limit 1
           ) id2
    FROM positions l;
END