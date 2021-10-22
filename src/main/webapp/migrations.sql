CREATE DATABASE IF NOT EXISTS adlister_db;
USE adlister_db;

DROP TABLE IF EXISTS ads;
DROP TABLE IF EXISTS users;



CREATE TABLE users
(

    id       INT UNSIGNED NOT NULL AUTO_INCREMENT,
    username VARCHAR(240),
    email    VARCHAR(240),
    password VARCHAR(240),
    PRIMARY KEY (id)

);


CREATE TABLE ads
(
    id  INT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id INT UNSIGNED NOT NULL,
    title   VARCHAR(240),
    description TEXT NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY (user_id) REFERENCES users (id)
        ON DELETE CASCADE
);


INSERT INTO USERS (username,email,password) Values ('sal', 'salazar1979', 'password123');
INSERT INTO ads (user_id, title, description) VALUES ('1','MACBOOK PRO','CRACKED SCREEN');
-- INSERT INTO ads (user_id, title, description) VALUES ('1','TV','old');


