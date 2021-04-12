CREATE PROCEDURE battleshipGameResults()
BEGIN
	/* Write your SQL here. Terminate each statement with a semicolon. */
    WITH base AS (
        SELECT l.id, ABS(
            (l.upper_left_x + l.upper_left_y) -
            (l.bottom_right_x + l.bottom_right_y)
        ) + 1 AS size, (
            SELECT COUNT(*) FROM opponents_shots
            WHERE (
                target_x >= l.upper_left_x
                AND target_x <= l.bottom_right_x
            ) AND (
                target_y >= l.upper_left_y
                AND target_y <= l.bottom_right_y
            )
        ) AS damage FROM locations_of_ships AS l
    )
    
    SELECT DISTINCT b.size, (
        SELECT COUNT(*) FROM base WHERE size = b.size
        AND damage = 0
    ) AS undamaged, (
        SELECT COUNT(*) FROM base WHERE size = b.size
        AND damage > 0 AND damage < size
    ) AS partly_damaged, (
        SELECT COUNT(*) FROM base WHERE size = b.size
        AND damage = size
    ) AS sunk FROM base AS b ORDER BY size;
END