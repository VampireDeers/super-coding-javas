-- 방법 1: 인라인
CREATE table book_room_1
(
	id INT NOT NULL,
    name VARCHAR(30),
    reserve_date DATE,
    room_num INT
);
-- 방법 2: ALTER 방식 (X)
CREATE table book_room_1
(
	id INT,
    name VARCHAR(30),
    reserve_date DATE,
    room_num INT
);
-- ALTER TABLE book_room_1 ADD CONSTRAINT id_not_null NOT NULL(id);

-- 방법 3: 외부 CONSTRAINT (X)
CREATE table book_room_1
(
	id INT NOT NULL,
    name VARCHAR(30),
    reserve_date DATE,
    room_num INT
	-- CONSTRAINTS id_not_null NOT NULL(id)
);

DESC book_room_1;

INSERT INTO book_room_1 (id, name, reserve_date, room_num)
values (null, 'room1', '2022-01-11', 5);
