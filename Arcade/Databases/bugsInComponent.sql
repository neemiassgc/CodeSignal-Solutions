CREATE PROCEDURE bugsInComponent()
BEGIN
    /* Write your SQL here. Terminate each statement with a semicolon. */
    SELECT b.title AS bug_title, c.title AS component_title,
    (
        SELECT COUNT(*) FROM BugComponent
        WHERE component_id = c.id
    ) AS bugs_in_component FROM Bug as b
    JOIN BugComponent AS bc ON b.num = bc.bug_num
    JOIN Component AS c ON bc.component_id = c.id
    WHERE b.num IN (
        SELECT bug_num FROM BugComponent
        GROUP BY bug_num HAVING COUNT(*) > 1
    ) ORDER BY bugs_in_component DESC, c.id, b.num;
END