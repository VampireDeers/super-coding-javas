DROP TABLE IF EXISTS member_2;

-- 방식 1. 인라인 생성
CREATE TABLE member_2(
	mem_id INT AUTO_INCREMENT PRIMARY KEY,
    mem_name VARCHAR(10) NOT NULL,
    height TINYINT UNSIGNED DEFAULT 160, -- NOT NULL 넣어도 DEFAULT로 동작함.
    distict_phone CHAR(3) DEFAULT '02'
);

-- 방식 2. 외부 제약 조건 생성(X)
CREATE TABLE member_2(
	mem_id INT AUTO_INCREMENT PRIMARY KEY,
    mem_name VARCHAR(10) NOT NULL,
    height TINYINT UNSIGNED,
    distict_phone CHAR(3)
    -- CONSTRAINT default_height DEFAULT 160
);

-- 방식 3. ALTER 방식 (X)
CREATE TABLE member_2(
	mem_id INT AUTO_INCREMENT PRIMARY KEY,
    mem_name VARCHAR(10) NOT NULL,
    height TINYINT UNSIGNED,
    distict_phone CHAR(3) CHECK( distict_phone IN ( '02', '031', '032') )
);
-- ALTER TABLE member_2 ADD CONSTRAINT height DEFAULT 160;

INSERT INTO member_2 (mem_name) VALUES ('이순신');
INSERT INTO member_2 (mem_name) VALUES ('이순신2');


