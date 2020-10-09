/*Please add ; after each select statement*/
CREATE PROCEDURE validPhoneNumbers()
BEGIN
	SELECT name, surname, phone_number
    FROM phone_numbers WHERE phone_number
    REGEXP "^(?>\\(1\\)|1-)\\d{3}-\\d{3}-\\d{4}$"
    ORDER BY surname;
END