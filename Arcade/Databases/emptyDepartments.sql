/*Please add ; after each select statement*/
CREATE PROCEDURE emptyDepartments()
BEGIN
    SELECT d.dep_name FROM departments AS d WHERE NOT EXISTS (
        SELECT * FROM employees AS e WHERE d.id = e.department
    );
END