/*Please add ; after each select statement*/
CREATE PROCEDURE combinationLock()
BEGIN
	SELECT ROUND(EXP(SUM(LOG(LENGTH(characters))))) AS combinations
    FROM discs;
END