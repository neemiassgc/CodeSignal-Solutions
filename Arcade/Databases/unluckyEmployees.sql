CREATE PROCEDURE unluckyEmployees()
BEGIN
	/* Write your SQL here. Terminate each statement with a semicolon. */
    SET @id := 0;
    WITH
        cte AS (
            SELECT (@id := @id + 1) AS id, x.* FROM (
                SELECT d.name AS dep_name,
                COUNT(full_name) AS emp_number,
                IFNULL(SUM(e.salary), 0) AS total_salary
                FROM Department AS d
                LEFT JOIN Employee AS e ON d.id = e.department
                GROUP BY dep_name HAVING emp_number < 6
                ORDER BY total_salary DESC, emp_number DESC, d.id
            ) AS x
        )
    
    SELECT dep_name, emp_number, total_salary
    FROM cte WHERE id % 2 > 0;
END