/*Please add ; after each select statement*/
CREATE PROCEDURE expressionsVerification()
BEGIN
	SELECT * FROM expressions
    WHERE CASE operation
    WHEN "+" THEN a + b = c
    WHEN "-" THEN a - b = c
    WHEN "/" THEN a / b = c
    WHEN "*" THEN a * b = c
    END;
END