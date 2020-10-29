DROP FUNCTION IF EXISTS get_total;
CREATE FUNCTION get_total(items VARCHAR(45)) RETURNS INT DETERMINISTIC
BEGIN
    SET @out := 0, @i := 1;
    
    WHILE REGEXP_SUBSTR(items, "\\d++", 1, @i) IS NOT NULL DO
        SET @out := @out + (SELECT price FROM item_prices
            WHERE id = REGEXP_SUBSTR(items, "\\d++", 1, @i) + 0);
        SET @i := @i + 1;
    END WHILE;
    
    RETURN @out;
END;

CREATE PROCEDURE orderPrices()
BEGIN
    SELECT id, buyer, get_total(items) AS total_price
    FROM orders
    ORDER BY id;
END;