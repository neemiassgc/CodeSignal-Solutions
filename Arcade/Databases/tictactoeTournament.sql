CREATE PROCEDURE tictactoeTournament()
BEGIN
    /* Write your SQL here. Terminate each statement with a semicolon. */
    SET @regx :=
    "^((xxx.{6}|...xxx...|.{6}xxx)|((x..){3}|(.x.){3}|(..x){3})|((x...){2}x|.(.x){3}..))$";
    SET @rego :=
    "^((ooo.{6}|...ooo...|.{6}ooo)|((o..){3}|(.o.){3}|(..o){3})|((o...){2}o|.(.o){3}..))$";
    
    WITH
    names AS (
        SELECT name_naughts AS name FROM results
        UNION
        SELECT name_crosses AS name FROM results
    ),
    base AS (
        SELECT n.name, (
            SELECT COUNT(board) FROM results
            WHERE name_naughts = n.name OR
            name_crosses = n.name
        ) AS played, (
            SELECT COUNT(board) FROM results
            WHERE (
                name_naughts = n.name AND
                REGEXP_LIKE(board, @rego, "i") = 1
            ) OR (
                name_crosses = n.name AND
                REGEXP_LIKE(board, @regx, "i") = 1
            )
        ) AS won, (
            SELECT COUNT(board) FROM results
            WHERE (
                name_naughts = n.name OR
                name_crosses = n.name
            ) AND (
                REGEXP_LIKE(board, @rego, "i") = 0 AND
                REGEXP_LIKE(board, @regx, "i") = 0
            )
        ) AS draw, (
            SELECT COUNT(board) FROM results
            WHERE (
                name_naughts = n.name AND
                REGEXP_LIKE(board, @regx, "i") = 1
            ) OR (
                name_crosses = n.name AND
                REGEXP_LIKE(board, @rego, "i") = 1 
            )
        ) AS lost FROM names AS n
    )
    
    SELECT name, (
        SELECT won * 2 + draw FROM base
        WHERE name = b.name
    ) AS points, played, won, draw, lost FROM base AS b
    ORDER BY points DESC, played, won DESC, name;
END;