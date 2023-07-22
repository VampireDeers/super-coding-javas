SELECT E1.employee_id AS '사번', E1.employee_name AS '이름', E1.duty AS '직급',
	   E2.employee_name AS '상사 이름', E2.duty AS '상사 직급' 
FROM employee E1
	LEFT JOIN employee E2
	ON E1.manager_id = E2.employee_id;