SELECT *
FROM group_singer G
	LEFT JOIN buy_history B
    ON G.mem_id = B.mem_id;