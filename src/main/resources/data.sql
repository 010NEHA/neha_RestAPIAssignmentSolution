insert into users (user_id,password, username) values (1,'$2a$12$.WE2J90swE8AHxTPS9tILeyf0kIZW7C0oQX.g5zfF8zNW.SSOoOwu', 'admin');
insert into users (user_id,password, username) values (2,'$2a$12$sunCiU37LRhHpIfke5fhXOBWD2OKdApEsuOzBy8ujaX/lzXqUo4YC', 'user');

insert into roles (role_id,name) values(1,'ADMIN');
insert into roles (role_id,name) values(2,'USER');

insert into users_roles (user_id, role_id) values (1, 1);
insert into users_roles (user_id, role_id) values (2, 2);

insert into employee (id, first_name, last_name, email) values (1, 'Ujjwal', 'Sharma', 'fdfdfd@gmail.com');
insert into employee (id, first_name, last_name, email) values (2, 'temp', 'Kaushik', 'jdfdkfdjj@gmail.com');
insert into employee (id, first_name, last_name, email) values (3, 'postman', 'postman', 'postman@gmail.com');