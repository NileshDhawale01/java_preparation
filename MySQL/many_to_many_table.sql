use test;

-- many to many

-- table create
create table user(
user_id int not null,
user_name varchar(50) not null,
about varchar(100) null,
primary key (user_id)
);

create table role(
role_id int not null,
role_name varchar(20) not null,
role_description varchar(50),
primary key (role_id)
);

-- alter tables to auto increament primary key
alter table user
modify user_id int not null auto_increment;

alter table role
modify role_id int not null auto_increment;

create table user_role(
user_id int not null,
role_id int not null,
primary key (user_id,role_id),
foreign key (user_id) references user(user_id),
foreign key (role_id) references role(role_id)
);

-- add data
-- if primary key is not auto increament we have to pass it
insert into role(role_name,role_description)
values
("Super Admin","All Access"),
("Admin","Most of The Access");

-- in user with user role
insert into user(user_name,about)
values ("User","Engineer");

insert into user_role(user_id,role_id)
values(last_insert_id(),2);