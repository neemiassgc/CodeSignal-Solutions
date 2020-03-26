CREATE PROCEDURE studentsInClubs()
    SELECT * FROM students
    WHERE EXISTS (
        SELECT * FROM clubs AS c WHERE c.id = students.club_id
    )
    ORDER BY students.id;