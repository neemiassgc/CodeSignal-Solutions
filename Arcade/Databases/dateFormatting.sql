/*Please add ; after each select statement*/
CREATE PROCEDURE dateFormatting()
BEGIN
	SELECT DATE_FORMAT(date_str, "%Y-%m-%d") AS date_iso
    FROM documents ORDER BY id;
END