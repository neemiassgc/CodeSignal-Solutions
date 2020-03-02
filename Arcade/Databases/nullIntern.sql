/*Please add ; after each select statement*/
CREATE PROCEDURE nullIntern()
BEGIN
	SELECT COUNT(id) AS number_of_nulls FROM departments
    WHERE description IS NULL OR 
    TRIM(description) IN ("null", "nil", "-");
END