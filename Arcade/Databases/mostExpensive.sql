CREATE PROCEDURE mostExpensive()
BEGIN
    SELECT name FROM Products ORDER BY price * quantity DESC,
    name ASC LIMIT 1;
END