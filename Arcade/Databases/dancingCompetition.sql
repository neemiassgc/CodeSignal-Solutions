/*Please add ; after each select statement*/
CREATE PROCEDURE dancingCompetition()
BEGIN
    SELECT it.arbiter_id, it.first_criterion,
    it.second_criterion, it.third_criterion
    FROM (
        SELECT *, IF(
            first_criterion = (SELECT MAX(first_criterion) FROM scores) OR
            first_criterion = (SELECT MIN(first_criterion) FROM scores), 1, 0
        ) + IF(
            second_criterion = (SELECT MAX(second_criterion) FROM scores) OR
            second_criterion = (SELECT MIN(second_criterion) FROM scores), 1, 0
        ) + IF(
            third_criterion = (SELECT MAX(third_criterion) FROM scores) OR
            third_criterion = (SELECT MIN(third_criterion) FROM scores), 1, 0
        )
        AS filter
        FROM scores GROUP BY arbiter_id
    ) AS it WHERE it.filter <= 1;
END