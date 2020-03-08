/*Please add ; after each select statement*/
CREATE PROCEDURE soccerGameSeries()
BEGIN
    SELECT IF(
        wins > 0, 1,
        IF(
            wins < 0, 2,
            IF(
                diff > 0, 1,
                IF(
                    diff < 0, 2,
                    IF(
                        host > 0, 1,
                        IF(
                            host < 0, 2, 0
                        )
                    )
                )
            )
        )
    ) winner
   FROM
   (
      SELECT 
        SUM(IF(s1 > s2, 1, -1)) wins,
        SUM(s1 - s2) diff, 
        SUM(IF(h = 2, s1, -s2)) host
      FROM
      (
        SELECT first_team_score s1, second_team_score s2, match_host h 
        FROM scores
      ) x
   ) y;
END