SELECT COUNT(*)
FROM group_singer
WHERE mem_id IN (
	SELECT G.mem_id
	FROM group_singer G
		LEFT JOIN buy_history B
		ON G.mem_id = B.mem_id
	WHERE B.buy_id IS NULL
);