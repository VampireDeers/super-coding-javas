SELECT COUNT(*)
FROM (
	SELECT G.mem_id, G.mem_name, 
	   SUM(B.price)
	FROM group_singer G
		INNER JOIN buy_history B
		ON G.mem_id = B.mem_id
	WHERE G.addr IN ('서울', '경기')
	GROUP BY G.mem_id
		HAVING SUM(B.price) > 10000
	) SUB
;