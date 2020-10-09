DROP FUNCTION IF EXISTS response;
CREATE FUNCTION response(name VARCHAR(40)) RETURNS VARCHAR(200) DETERMINISTIC
BEGIN
    RETURN CONCAT("Dear ", CONCAT(
    REGEXP_REPLACE(LOWER(SUBSTRING_INDEX(name, " ", 1)), ".",
    UPPER(SUBSTR(SUBSTRING_INDEX(name, " ", 1), 1, 1)), 1, 1), " ",
    REGEXP_REPLACE(LOWER(SUBSTRING_INDEX(name, " ", -1)), ".",
    UPPER(SUBSTR(SUBSTRING_INDEX(name, " ", -1), 1, 1)), 1, 1)),
    "! We received your message and will ",
    "process it as soon as possible. Thanks for ",
    "using our service. FooBar On! - FooBarIO team.");
END;

CREATE PROCEDURE customerMessages()
BEGIN
    SELECT id, name, response(name) AS response
    FROM customers;
END;