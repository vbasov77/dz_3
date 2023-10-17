create table users
(
    id       bigint       NOT NULL AUTO_INCREMENT,
    user_name varchar(100) not null,
    primary key (id)
);

INSERT INTO users (id, user_name)
VALUES (1, 'user');
