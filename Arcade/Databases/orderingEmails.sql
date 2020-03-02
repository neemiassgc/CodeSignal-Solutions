/*Please add ; after each select statement*/
CREATE PROCEDURE orderingEmails()
BEGIN
	SELECT id, email_title, CONCAT(FLOOR(
        IF(size < POW(2, 20),(size / POW(2, 10)), (size / POW(2, 20)))
    ), " ", IF(size < POW(2, 20), "Kb", "Mb"))
    AS short_size FROM emails
    ORDER BY size DESC;
END