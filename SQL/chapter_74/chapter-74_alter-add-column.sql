ALTER TABLE member
ADD COLUMN email VARCHAR(50);

ALTER TABLE netflix_movie
ADD COLUMN release_date DATE AFTER movie_title;

DESC member;
DESC netflix_movie;