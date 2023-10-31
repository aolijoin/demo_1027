create table tb_user
(
    id       int auto_increment
        primary key,
    name     varchar(50) null,
    username varchar(50) null,
    password varchar(50) null
)
    engine = InnoDB;

INSERT INTO demo1027.tb_user (name, username, password) VALUES ('admin', '123', '123');
INSERT INTO demo1027.tb_user (name, username, password) VALUES ('zhangsan', 'zhang', '123');


create table tb_student
(
    id       int auto_increment
        primary key,
    name     varchar(50)  null,
    age      int          null,
    sex      varchar(10)  null,
    birthday date         null,
    address  varchar(255) null,
    img      varchar(255) null
)
    engine = InnoDB;

INSERT INTO demo1027.tb_student (name, age, sex, birthday, address, img) VALUES ('jerry', 20, '女', '2023-07-19', '河南', 'http://localhost:8081/images/a90194ab-278c-4443-8aad-5357e7a2dc14.jpg');
INSERT INTO demo1027.tb_student (name, age, sex, birthday, address, img) VALUES ('zhang', 18, '男', '2023-07-20', '河南', 'http://localhost:8081/images/68eba098-6aa5-4438-bf0b-839a6a0231c7.jpg');
INSERT INTO demo1027.tb_student (name, age, sex, birthday, address, img) VALUES ('san', 20, '女', '2023-07-21', '河南', 'http://localhost:8081/images/68eba098-6aa5-4438-bf0b-839a6a0231c7.jpg');
INSERT INTO demo1027.tb_student (name, age, sex, birthday, address, img) VALUES ('li', 18, '男', '2023-07-22', '河南', 'http://localhost:8081/images/68eba098-6aa5-4438-bf0b-839a6a0231c7.jpg');
INSERT INTO demo1027.tb_student (name, age, sex, birthday, address, img) VALUES ('si', 20, '女', '2023-07-23', '河南', 'http://localhost:8081/images/68eba098-6aa5-4438-bf0b-839a6a0231c7.jpg');
INSERT INTO demo1027.tb_student (name, age, sex, birthday, address, img) VALUES ('wangwu', 18, '男', '2023-07-24', '河南', 'http://localhost:8081/images/68eba098-6aa5-4438-bf0b-839a6a0231c7.jpg');
INSERT INTO demo1027.tb_student (name, age, sex, birthday, address, img) VALUES ('麻子', 20, '女', '2023-07-25', '河南', 'http://localhost:8081/images/68eba098-6aa5-4438-bf0b-839a6a0231c7.jpg');
INSERT INTO demo1027.tb_student (name, age, sex, birthday, address, img) VALUES ('asubod', 18, '男', '2023-10-15', '地球', 'http://localhost:8081/images/68eba098-6aa5-4438-bf0b-839a6a0231c7.jpg');
INSERT INTO demo1027.tb_student (name, age, sex, birthday, address, img) VALUES ('咋送电话您', 14, '女', '2023-10-15', '地球', 'http://localhost:8081/images/68eba098-6aa5-4438-bf0b-839a6a0231c7.jpg');
INSERT INTO demo1027.tb_student (name, age, sex, birthday, address, img) VALUES ('张三', 19, '女', '2023-10-13', '地球', 'http://localhost:8081/images/68eba098-6aa5-4438-bf0b-839a6a0231c7.jpg');
INSERT INTO demo1027.tb_student (name, age, sex, birthday, address, img) VALUES ('阿瑟东', 18, '男', '2023-10-13', 'oabsd', 'http://localhost:8081/images/68eba098-6aa5-4438-bf0b-839a6a0231c7.jpg');
INSERT INTO demo1027.tb_student (name, age, sex, birthday, address, img) VALUES ('asd', 19, '男', '2023-10-29', 'asdhwe', 'http://localhost:8081/images/68eba098-6aa5-4438-bf0b-839a6a0231c7.jpg');
