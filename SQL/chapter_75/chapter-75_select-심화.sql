SELECT mem_id, SUM(amount)
FROM buy_history
GROUP BY mem_id;

SELECT mem_id, SUM(amount * price)
FROM buy_history
GROUP BY mem_id;