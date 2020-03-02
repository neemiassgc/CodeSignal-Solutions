CREATE PROCEDURE interestClub()
    SELECT name
    FROM people_interests
    WHERE interests & (FIND_IN_SET('reading', interests) > 0)
    AND interests & (FIND_IN_SET('drawing', interests) > 0)
ORDER BY name