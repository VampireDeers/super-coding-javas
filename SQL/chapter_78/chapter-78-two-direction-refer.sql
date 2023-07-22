USE chapter_78;

DROP TABLE IF EXISTS addresses;
DROP TABLE IF EXISTS users;

CREATE TABLE users (
	id INT AUTO_INCREMENT PRIMARY KEY,
    addresses_id INT UNIQUE,
    user_name VARCHAR(25),
    enabled BOOLEAN
);

CREATE TABLE addresses (
	addresses_id INT AUTO_INCREMENT PRIMARY KEY,
	user_id INT NOT NULL UNIQUE, -- PRIMARY가 아니면 UNIQUE 사용.
    street VARCHAR(30),
    city VARCHAR(30),
    state VARCHAR(30),
    FOREIGN KEY(user_id) REFERENCES users (id)
);
ALTER TABLE users 
ADD CONSTRAINT address_fk FOREIGN KEY(addresses_id) REFERENCES addresses(user_id);

-- 만드는 것 부터 힘듬
-- 이제 삭제하는 것과 업데이트할 때, 제약이 많음.
-- 만약 CACADE 까지 되어있는 상태라면 어떤 부작요일지.

ALTER TABLE users
DROP CONSTRAINT id_fk;

DESC addresses;
