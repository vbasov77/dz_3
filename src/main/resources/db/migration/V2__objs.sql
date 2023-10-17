create table objs
(
    id       bigint       not null AUTO_INCREMENT,
    user_id  bigint       not null,
    name_obj varchar(255) not null,
    primary key (id)

);

insert into  objs(user_id, name_obj)
values (1, 'Вилка'),
       (1, 'Ложка'),
       (1, 'Тарелка');


