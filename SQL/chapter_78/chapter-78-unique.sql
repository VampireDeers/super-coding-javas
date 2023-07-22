-- 방법 1. 인라인 방식
CREATE TABLE book_room_2
(
	id INT UNIQUE,
    name VARCHAR(30),
    reserve_date DATE,
    room_num INT
);

-- 방법 2: 외부 제약 선언
CREATE TABLE book_room_2
(
	id INT,
    name VARCHAR(30),
    reserve_date DATE,
    room_num INT,
    CONSTRAINT id_unique UNIQUE(id),
    UNIQUE (name)
);
 
-- 방법 3: ALTER 사용
CREATE TABLE book_room_2
(
	id INT,
    name VARCHAR(30),
    reserve_date DATE,
    room_num INT
);
ALTER TABLE book_room_2
ADD CONSTRAINT id_unique UNIQUE(id);

DESC book_room_2;

INSERT INTO book_room_2 (id, name, reserve_date, room_num)
values (1, 'room1', '2022-01-11', 5);

-- 불가능
INSERT INTO book_room_2 (id, name, reserve_date, room_num)
values (1, 'room2', '2022-01-12', 6);

INSERT INTO book_room_2 (id, name, reserve_date, room_num)
values (null, 'room2', '2022-01-12', 6);

INSERT INTO book_room_2 (id, name, reserve_date, room_num)
values (null, 'room2', '2022-01-12', 6);


