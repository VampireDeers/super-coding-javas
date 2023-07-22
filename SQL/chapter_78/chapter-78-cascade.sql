DROP TABLE IF EXISTS buy_history_1;

CREATE TABLE buy_history_1 (
	buy_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, -- 순번(PK)
	mem_id CHAR(8) NOT NULL, -- 아이디(FK)
    prod_name CHAR(6) NOT NULL, -- 제품 이름
    group_name CHAR(4), -- 분류
    price INT NOT NULL, -- 단가
    amount SMALLINT NOT NULL -- 수량
);

ALTER TABLE buy_history_1
ADD CONSTRAINT mem_id_fk2 
FOREIGN KEY(mem_id) REFERENCES group_singer(mem_id)
ON UPDATE CASCADE
ON DELETE CASCADE;

ALTER TABLE buy_history_1
DROP CONSTRAINT mem_id_fk2;

