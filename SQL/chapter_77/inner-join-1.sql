SELECT *
FROM group_singer
	INNER JOIN buy_history
    ON group_singer.mem_id = buy_history.mem_id;