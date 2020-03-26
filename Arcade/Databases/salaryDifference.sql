/*Please add ; after each select statement*/
CREATE PROCEDURE salaryDifference()
BEGIN
    SELECT COALESCE(((SELECT MAX(salary) FROM employees) *
    (
        SELECT COUNT(salary) FROM employees
        WHERE salary = (SELECT MAX(salary) FROM employees)
    )) - (SELECT MIN(salary) FROM employees) *
    (
        SELECT COUNT(salary) FROM employees
        WHERE salary = (SELECT MIN(salary) FROM employees)
    ), 0) AS difference;
END