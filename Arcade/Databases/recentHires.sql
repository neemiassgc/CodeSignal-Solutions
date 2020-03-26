/*Please add ; after each select statement*/
CREATE PROCEDURE recentHires()
BEGIN
    SET @let := 0;
    WITH
        cte1 AS (
            SELECT name, (@let := @let + 1) AS filter FROM (
                SELECT name FROM pr_department
                ORDER BY date_joined DESC LIMIT 5
            ) AS x ORDER BY name
        ),
        cte2 AS (
            SELECT name, (@let := @let + 1) AS filter FROM (
                SELECT name FROM it_department
                ORDER BY date_joined DESC LIMIT 5
            ) AS y ORDER BY name
        ),
        cte3 AS (
            SELECT name, (@let := @let + 1) AS filter FROM (
                SELECT name FROM sales_department
                ORDER BY date_joined DESC LIMIT 5
            ) AS z ORDER BY name
        )
    SELECT names FROM (
        SELECT name AS names, filter FROM cte1 UNION ALL
        SELECT name AS names, filter FROM cte2 UNION ALL
        SELECT name AS names, filter FROM cte3
        ORDER BY filter ASC
    ) AS n;
END