/*Please add ; after each select statement*/
CREATE PROCEDURE scholarshipsDistribution()
BEGIN
	SELECT candidate_id AS student_id FROM candidates
    WHERE candidate_id NOT IN (
        SELECT student_id FROM detentions
    );
END