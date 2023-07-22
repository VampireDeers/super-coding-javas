-- 방법 1: 인라인 방식
CREATE TABLE book_room_3
(
	id INT PRIMARY KEY,
    name VARCHAR(30),
    reserve_date DATE,
    room_num INT
);

-- 방법 2: 외부 제약선언
CREATE TABLE book_room_3
(
	id INT,
    name VARCHAR(30),
    reserve_date DATE,
    room_num INT,
    CONSTRAINT id_pk PRIMARY KEY(id)
    -- PRIMARY KEY(id)
);
-- 방법 3: ALTER 사용
CREATE TABLE book_room_3
(
	id INT,
    name VARCHAR(30),
    reserve_date DATE,
    room_num INT
);
ALTER TABLE book_room_3
ADD CONSTRAINT id_pk PRIMARY KEY(id);

DESC book_room_3;

-- 값 넣기

INSERT INTO book_room_3 (id, name, reserve_date, room_num)
values (1, 'room1', '2022-01-11', 5);

-- 불가능
INSERT INTO book_room_3 (id, name, reserve_date, room_num)
values (1, 'room2', '2022-01-12', 6);

-- 불가능
INSERT INTO book_room_3 (id, name, reserve_date, room_num)
values (null, 'room2', '2022-01-12', 6);

