/*Please add ; after each select statement*/
CREATE PROCEDURE suspectsInvestigation()
BEGIN
	SELECT id, name, surname FROM Suspect AS s
    WHERE s.height <= 170 AND
    name LIKE "b%" AND surname LIKE "gre_n";
END