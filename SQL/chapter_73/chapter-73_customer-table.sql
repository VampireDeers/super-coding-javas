CREATE TABLE member
(
	mem_name VARCHAR(10),
    member_number TINYINT,
    addr VARCHAR(30),
    phone CHAR(12), -- 하이폰 제외
    height TINYINT UNSIGNED, -- 키
    enroll_date DATETIME
);

DESC member;