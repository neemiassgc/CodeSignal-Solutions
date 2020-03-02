/*Please add ; after each select statement*/
CREATE PROCEDURE mischievousNephews()
BEGIN
	SELECT WEEKDAY(mischief_date) AS weekday, mischief_date,
    author, title FROM mischief WHERE (author = "Huey") OR
    (author = "Dewey") OR (author = "Louie") ORDER BY weekday,
    Field(author, 'Huey', 'Dewey' ,'Louie'), mischief_date, title;
END