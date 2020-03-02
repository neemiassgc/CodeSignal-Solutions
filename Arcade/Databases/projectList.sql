CREATE PROCEDURE projectList()
BEGIN
	SELECT project_name, team_lead, income
    FROM Projects ORDER BY internal_id ASC;
END