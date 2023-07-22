CREATE TABLE netflix_movie
(
	movie_title VARCHAR(30),
    movie_director VARCHAR(20),
    movie_star VARCHAR(20), -- 주연 배우
    movie_script LONGTEXT, -- 영화 자막
    movie_film LONGBLOB -- 실제 동영상 데이터
);

DESC netflix_movie;