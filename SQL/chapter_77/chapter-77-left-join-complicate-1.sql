SELECT G.mem_id, G.mem_name, G.height
FROM group_singer G
	LEFT JOIN buy_history B
    ON G.mem_id = B.mem_id
WHERE B.buy_id IS NULL
ORDER BY G.height DESC
LIMIT 3;