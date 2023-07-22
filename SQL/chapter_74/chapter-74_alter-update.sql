ALTER TABLE member
MODIFY COLUMN phone VARCHAR(15);

ALTER TABLE netflix_movie
MODIFY COLUMN movie_director VARCHAR(50) NOT NULL;

DESC netflix_movie;