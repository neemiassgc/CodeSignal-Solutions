/*Please add ; after each select statement*/
CREATE PROCEDURE securityBreach()
BEGIN
	SELECT first_name, second_name, attribute
    FROM users WHERE
    REGEXP_LIKE(attribute, CONCAT("\\w+%", first_name,
    "_", second_name, "%", "\\w*"), "c")
    ORDER BY attribute; 
END