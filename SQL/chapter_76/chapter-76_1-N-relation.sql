CREATE TABLE book (
	id INT AUTO_INCREMENT PRIMARY KEY,
    book_name VARCHAR(25),
    author VARCHAR(20),
    content LONGTEXT
);

CREATE TABLE reviews (
	reviews_id INT PRIMARY KEY,
    book_id INT NOT NULL,
    user_name VARCHAR(20),
    content MEDIUMTEXT,
    FOREIGN KEY(book_id) REFERENCES book (id)
);

DESC reviews;