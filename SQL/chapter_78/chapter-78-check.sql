DROP TABLE IF EXISTS member_1;

-- 방식 1. 인라인 생성
CREATE TABLE member_1(
	mem_id INT AUTO_INCREMENT PRIMARY KEY,
    mem_name VARCHAR(10) NOT NULL,
    height TINYINT UNSIGNED CHECK( height >= 100 ),
    distict_phone CHAR(3) CHECK( distict_phone IN ( '02', '031', '032') )
);

INSERT INTO member_1 (mem_name, height) 
VALUES ('이순신', 180);

INSERT INTO member_1 (mem_name, height)
VALUES ('이순신2', 90);

-- 방식 2. 외부 제약 조건 생성
CREATE TABLE member_1(
	mem_id INT AUTO_INCREMENT PRIMARY KEY,
    mem_name VARCHAR(10) NOT NULL,
    height TINYINT UNSIGNED,
    distict_phone CHAR(3) CHECK( distict_phone IN ( '02', '031', '032') ),
    
	CHECK ( height >= 100 )
);

-- 방식 3. ALTER 
CREATE TABLE member_1(
	mem_id INT AUTO_INCREMENT PRIMARY KEY,
    mem_name VARCHAR(10) NOT NULL,
    height TINYINT UNSIGNED,
    distict_phone CHAR(3) CHECK( distict_phone IN ( '02', '031', '032') )
);
ALTER TABLE member_1
ADD CONSTRAINT check_height CHECK( height >= 100 );

DESC member_1;