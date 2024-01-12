create table persons
(
    id         bigint primary key,
    first_name varchar,
    last_name  varchar,
    points     bigint default 0,
    good_mode  bool default false
);

insert into PERSONS(id, first_name, last_name, points, good_mode)
VALUES (1, 'Гадя', 'Хренова', 52, true);
insert into PERSONS(id, first_name, last_name, points, good_mode)
VALUES (2, 'Василий', 'Уткин', 317, false);
insert into PERSONS(id, first_name, last_name, points, good_mode)
VALUES (3, 'Виктор', 'Пелевин', 87, false);
insert into PERSONS(id, first_name, last_name, points, good_mode)
VALUES (4, 'Гаррик', 'Поттеров', 999, false);
insert into PERSONS(id, first_name, last_name, points, good_mode)
VALUES (5, 'Фёдр', 'Двинятин', 190, false);
insert into PERSONS(id, first_name, last_name, points, good_mode)
VALUES (6, 'Борис', 'Годунов', 33, true);
insert into PERSONS(id, first_name, last_name, points, good_mode)
VALUES (7, 'Степан', 'Разин', 718, false);
