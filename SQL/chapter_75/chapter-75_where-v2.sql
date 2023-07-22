SELECT *
FROM group_singer
WHERE height BETWEEN 160 AND 170;

SELECT *
FROM group_singer
WHERE addr IN ('경기', '경남');

SELECT *
FROM group_singer
WHERE mem_name LIKE '세%';

SELECT *
FROM group_singer
WHERE mem_name LIKE '__핑크';
