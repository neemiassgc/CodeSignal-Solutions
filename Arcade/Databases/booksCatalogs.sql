/*Please add ; after each select statement*/
CREATE PROCEDURE booksCatalogs()
BEGIN
	SELECT DISTINCT SUBSTRING_INDEX(ExtractValue(xml_doc, "//author"),
    " ", 2)
    AS author FROM catalogs ORDER BY author;
END