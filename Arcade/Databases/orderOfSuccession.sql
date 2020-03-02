/*Please add ; after each select statement*/
CREATE PROCEDURE orderOfSuccession()
BEGIN
    SELECT CONCAT(IF(gender = "M", "King", "Queen"), " ", name) AS name
    FROM Successors ORDER BY birthday;
END