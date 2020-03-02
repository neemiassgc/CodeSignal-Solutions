CREATE PROCEDURE countriesSelection()
BEGIN
	SELECT * FROM countries WHERE continent = "Africa"
    ORDER BY name ASC;
END