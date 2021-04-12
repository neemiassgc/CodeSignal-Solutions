CREATE FUNCTION isNumber(class VARCHAR(45))
RETURNS BOOLEAN
BEGIN
    DECLARE basec VARCHAR(45) DEFAULT '';
    DECLARE next VARCHAR(45) DEFAULT NULL;
    DECLARE ret BOOLEAN DEFAULT FALSE;
    DECLARE i INT DEFAULT 0;
    SET next = class;
    SET ret = FALSE;
    SET i = 0;
    WHILE i < 200 AND (NOT ret)
    AND (SELECT COUNT(base) FROM inheritance WHERE derived = next LIMIT 1) DO
       
        SELECT base INTO basec FROM inheritance WHERE derived = next LIMIT 1;
        SET ret = IF(IFNULL(basec,'') = 'Number', TRUE, FALSE);
        SET next = basec;
        SET i = i+1;
    END WHILE;
    RETURN ret OR i > 100; 
END;

CREATE PROCEDURE typeInheritance()
BEGIN
   	SELECT var_name, type as var_type FROM variables
    WHERE isNumber(type) ORDER BY var_name;
END