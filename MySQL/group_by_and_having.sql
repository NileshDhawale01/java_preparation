use test;

create table data_store(
data_id int not null,
data_type varchar(100) not null,
data_about varchar(200) null,
primary key (data_id)
);

alter table data_store
modify data_id int not null auto_increment;

alter table data_store
add column price float null after data_about;

truncate table data_store;

insert into data_store(data_type,data_about,price)
values
("Book","Book Data 1",10.00),
("Book","Book Data 2",20.00),
("Book","Book Data 3",30.00),
("Book","Book Data 4",40.00),
("Pen","Pen Data 1",100.00),
("Pen","Pen Data 2",200.00),
("Pen","Pen Data 3",300.00),
("Pen","Pen Data 4",400.00),
("Schoool","Schoool Data 1",1000.00),
("Schoool","Schoool Data 2",2000.00),
("Schoool","Schoool Data 3",3000.00),
("Schoool","Schoool Data 4",4000.00);

-- test
select * from data_store;

-- groop by and having

select data_type,sum(price) from data_store as ds
where data_type="Pen" and price>=100.00
group by data_type;

-- without where clouse
select data_type,sum(price) from data_store as ds
group by data_type;

-- What happens if I GROUP BY one column, but in the SELECT, I include another column that has different values within the same group?
-- in SQL strictmode ERROR and in MySQL normal mode Random values for that field

-- having add condition on group by result
select data_type,sum(price) from data_store
group by data_type
having sum(price)>=2000;

-- !!! where can filter the row befour grouping
-- !!! having can filter the row after grouping
-- !!! we can't use having without group by

select data_type,sum(price) from data_store
where price>=100
group by data_type
having sum(price) >=1000.01;
