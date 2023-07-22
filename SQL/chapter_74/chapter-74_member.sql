USE chapter_74;
CREATE TABLE member
(
	member_id INT AUTO_INCREMENT PRIMARY KEY,
	mem_name VARCHAR(10) NOT NULL,
    addr VARCHAR(30),
    phone CHAR(12), -- 하이폰 제외
    height TINYINT UNSIGNED, -- 키
    enroll_date DATETIME
);

DESC member;