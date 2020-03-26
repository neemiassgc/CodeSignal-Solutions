CREATE PROCEDURE nicknames()
BEGIN
	UPDATE reservedNicknames
    SET nickname = CONCAT("rename - ", nickname),
    id = CONCAT("rename - ", id)
    WHERE LENGTH(nickname) <> 8;

    SELECT * FROM reservedNicknames ORDER BY id;
END