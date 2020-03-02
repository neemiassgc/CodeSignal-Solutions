/*Please add ; after each select statement*/
CREATE PROCEDURE marketReport()
BEGIN
    WITH cte AS (
        SELECT country, COUNT(country) AS competitors
        FROM foreignCompetitors GROUP BY country ORDER BY country ASC
    )
    SELECT * FROM cte
    UNION ALL
    SELECT "Total:" AS country, COUNT(country) AS competitors
    FROM foreignCompetitors;
END