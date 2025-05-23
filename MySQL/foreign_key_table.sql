use test;

-- create table with foreign key
create table books(
book_id int not null,
author_id int null,
book_name varchar(100) not null,
book_description varchar(200) null,
primary key (book_id),
foreign key (author_id) references author(author_id)
);

-- alter table -- changing the foreign key reference is little bit tricky!!!
alter table books
modify author_id int null;

-- add data
insert into books (book_id,author_id,book_name,book_description) values
(1,1,"Life","Book About Life on Earth"),
(2,2,"Journey","Book About Life Journey");