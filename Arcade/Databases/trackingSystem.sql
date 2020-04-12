/*Please add ; after each select statement*/
CREATE PROCEDURE trackingSystem()
BEGIN
   WITH
        cte_id AS (
            SELECT DISTINCT anonymous_id AS id FROM tracks
            ORDER BY anonymous_id ASC
        ),
        cte_l AS (
            SELECT id, (
                SELECT event_name FROM tracks
                WHERE anonymous_id = a.id
                AND user_id IS NOT NULL
                ORDER BY received_at ASC LIMIT 1
            ) AS event_name FROM cte_id AS a
        ),
        cte_f AS (
            SELECT id, (
                SELECT event_name FROM tracks
                WHERE anonymous_id = a.id
                AND user_id IS NULL
                ORDER BY received_at DESC LIMIT 1
            ) AS event_name FROM cte_id AS a
        )

    SELECT a.id AS anonym_id, a.event_name AS last_null,
    b.event_name AS first_notnull FROM cte_f AS a, cte_l AS b
    WHERE a.id = b.id;
END