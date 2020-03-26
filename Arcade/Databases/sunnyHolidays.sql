/*Please add ; after each select statement*/
CREATE PROCEDURE sunnyHolidays()
BEGIN
	SELECT h.holiday_date AS ski_date FROM holidays AS h
    INNER JOIN weather AS w ON h.holiday_date = w.sunny_date
    ORDER BY ski_date;
END