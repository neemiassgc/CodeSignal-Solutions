CREATE PROCEDURE officeBranches()
BEGIN
    ALTER TABLE branches ADD FOREIGN KEY (branchtype_id)
    REFERENCES branch_types (id) ON DELETE SET NULL;

    DELETE FROM branch_types WHERE name LIKE '%-outdated';

    SELECT * FROM branches
    ORDER BY branch_id;
END