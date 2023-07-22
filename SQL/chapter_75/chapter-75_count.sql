SELECT mem_id, AVG(amount) AS "평균 갯수"
FROM buy_history
GROUP BY mem_id;

SELECT COUNT(*)
FROM buy_history;

SELECT mem_id, COUNT(*)
FROM buy_history
GROUP BY mem_id;

