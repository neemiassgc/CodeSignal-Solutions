/*Please add ; after each select statement*/
CREATE PROCEDURE checkExpenditure()
BEGIN
    SELECT ae.id AS id,
    IF(SUM(ep.expenditure_sum) < ae.value, 0,
    SUM(ep.expenditure_sum) - ae.value) AS loss
    FROM expenditure_plan AS ep, allowable_expenditure AS ae
    WHERE WEEK(monday_date) BETWEEN ae.left_bound
    AND ae.right_bound GROUP BY ae.id;
END