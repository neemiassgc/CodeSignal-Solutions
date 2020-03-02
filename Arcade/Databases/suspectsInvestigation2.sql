/*Please add ; after each select statement*/
CREATE PROCEDURE suspectsInvestigation2()
BEGIN
	SELECT id, name, surname FROM Suspect AS s
    WHERE s.height <= 170 OR surname NOT LIKE "gre_n"
    OR name NOT LIKE "B%";
END