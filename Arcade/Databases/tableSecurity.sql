CREATE PROCEDURE tableSecurity()
BEGIN
    CREATE OR REPLACE VIEW emp
    AS SELECT id,
              name,
              YEAR(date_joined) AS date_joined,
              "-" AS salary FROM employees;

    SELECT id, name, date_joined, salary
    FROM emp
    ORDER BY id;
END
