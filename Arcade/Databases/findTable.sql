CREATE PROCEDURE findTable()
BEGIN
    /* Write your SQL here. Terminate each statement with a semicolon. */
    SELECT TABLE_NAME AS tab_name, COLUMN_NAME AS col_name,
    DATA_TYPE AS data_type FROM information_schema.columns
    WHERE table_schema = 'ri_db' AND table_name LIKE "e%s"
    ORDER BY TABLE_NAME, COLUMN_NAME;
    
END