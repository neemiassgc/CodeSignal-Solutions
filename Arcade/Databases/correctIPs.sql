/*Please add ; after each select statement*/
CREATE PROCEDURE correctIPs()
BEGIN
	SELECT id, ip FROM ips
    WHERE ip REGEXP "(\\d{2}\\.\\d+)$|(\\.\\d{2})$"
    AND IS_IPV4(ip) ORDER BY id;
END