CREATE TABLE users_book_purchase (
	id INT AUTO_INCREMENT PRIMARY KEY,
    book_id INT UNIQUE NOT NULL,
    user_id INT UNIQUE NOT NULL,
    purchase_date DATETIME,
    price INT NOT NULL,
	FOREIGN KEY(book_id) REFERENCES book (id),
    FOREIGN KEY(user_id) REFERENCES users (id)
);

DESC users_book_purchase;
