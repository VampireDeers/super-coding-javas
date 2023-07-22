SELECT group_singer.mem_id, group_singer.mem_name, 
	   buy_history.prod_name, buy_history.price
FROM group_singer
	INNER JOIN buy_history
    ON group_singer.mem_id = buy_history.mem_id;