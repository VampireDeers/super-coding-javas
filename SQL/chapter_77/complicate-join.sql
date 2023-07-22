SELECT G.mem_id, G.mem_name, 
	   SUM(B.price) as total_price
FROM group_singer G
	INNER JOIN buy_history B
    ON G.mem_id = B.mem_id
WHERE B.price > 1000
GROUP BY B.mem_id
	HAVING total_price > 5000
ORDER BY total_price DESC
LIMIT 3;