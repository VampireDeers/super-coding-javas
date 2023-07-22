SELECT mem_id, SUM(amount * price) AS '비용'
FROM buy_history
GROUP BY mem_id
HAVING SUM(amount * price) > 10000;