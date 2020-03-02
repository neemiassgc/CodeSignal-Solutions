CREATE PROCEDURE gradeDistribution()
BEGIN
    SELECT Name, ID FROM Grades
    WHERE Final > (Midterm1+Midterm2) / 2
    ORDER BY LEFT(Name, 3);
END