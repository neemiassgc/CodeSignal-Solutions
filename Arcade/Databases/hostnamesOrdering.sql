/*Please add ; after each select statement*/
CREATE PROCEDURE hostnamesOrdering()
BEGIN
    SELECT id, hostname FROM hostnames
    ORDER BY REVERSE(SUBSTR(CONCAT_WS(".",
    SUBSTRING_INDEX(REVERSE(SUBSTRING_INDEX(hostname, ".", 1)), ".", 1),
    SUBSTRING_INDEX(REVERSE(SUBSTRING_INDEX(hostname, ".", 2)), ".", 1),
    SUBSTRING_INDEX(REVERSE(SUBSTRING_INDEX(hostname, ".", 3)), ".", 1)),
    1, CHAR_LENGTH(hostname))) ASC;
END