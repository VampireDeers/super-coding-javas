CREATE TABLE book_room_4
(
	id INT PRIMARY KEY,
	id2 INT NOT NULL UNIQUE,
	id3 INT NOT NULL UNIQUE,
    name VARCHAR(30),
    reserve_date DATE,
    room_num INT
);

CREATE TABLE book_room_5
(
	id INT PRIMARY KEY,
	id2 INT PRIMARY KEY,
	id3 INT PRIMARY KEY,
    name VARCHAR(30),
    reserve_date DATE,
    room_num INT
);

DESC book_room_4;