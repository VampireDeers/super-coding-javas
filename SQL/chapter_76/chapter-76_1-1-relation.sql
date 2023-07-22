CREATE TABLE users (
	id INT AUTO_INCREMENT PRIMARY KEY,
    user_name VARCHAR(25),
    enabled BOOLEAN
);

CREATE TABLE addresses (
	user_id INT PRIMARY KEY, -- PRIMARY가 아니면 UNIQUE 사용.
    street VARCHAR(30),
    city VARCHAR(30),
    state VARCHAR(30),
    FOREIGN KEY(user_id) REFERENCES users (id)
);

DESC addresses;