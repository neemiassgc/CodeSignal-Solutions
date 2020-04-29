/*Please add ; after each select statement*/
CREATE PROCEDURE storageOptimization()
BEGIN
    SELECT id, 'name' AS column_name, name AS value
    FROM workers_info
    WHERE name IS NOT NULL
    UNION
    SELECT id, 'date_of_birth', date_of_birth
    FROM workers_info
    WHERE date_of_birth IS NOT NULL
    UNION
    SELECT id, 'salary', salary
    FROM workers_info
    WHERE salary IS NOT NULL
    ORDER BY id, FIELD(column_name, 'name', 'date_of_birth', 'salary');
END