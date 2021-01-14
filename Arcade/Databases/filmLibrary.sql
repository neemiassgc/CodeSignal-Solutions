CREATE PROCEDURE filmLibrary()
BEGIN
	/* Write your SQL here. Terminate each statement with a semicolon. */
    SET @fav_genre = (SELECT genre FROM movies
    GROUP BY genre ORDER BY COUNT(*) DESC LIMIT 1);
    
    SELECT s.actor, a.age FROM starring_actors AS s
    INNER JOIN actor_ages AS a ON s.actor = a.actor
    WHERE movie_name IN (SELECT movie FROM movies WHERE genre = @fav_genre)
    ORDER BY a.age DESC, s.actor;
END