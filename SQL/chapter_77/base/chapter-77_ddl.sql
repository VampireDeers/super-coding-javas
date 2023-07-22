CREATE DATABASE chapter_77;
USE chapter_77;

CREATE TABLE group_singer (
  mem_id CHAR(8) NOT NULL PRIMARY KEY, -- 가수 ID
  mem_name VARCHAR(10) NOT NULL, -- 이름
  mem_number INT NOT NULL, -- 인원 수 
  addr 	VARCHAR(2) NOT NULL, -- 주소(경기, 서울, 경남 식으로 2글자 입력)
  phone	VARCHAR(11), -- 전화번호 (하이픈 제외)
  height SMALLINT, -- 평균 키
  debut_date DATE -- 데뷔
);

CREATE TABLE buy_history (
	buy_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, -- 순번(PK)
	mem_id CHAR(8) NOT NULL, -- 아이디(FK)
    prod_name CHAR(6) NOT NULL, -- 제품 이름
    group_name CHAR(4), -- 분류
    price INT NOT NULL, -- 단가
    amount SMALLINT NOT NULL, -- 수량
    FOREIGN KEY (mem_id) REFERENCES group_singer(mem_id)
);