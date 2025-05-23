-- database test;
-- drop database test;

use test;

-- create normal table
CREATE TABLE author(
author_id int not null,
author_name varchar(100) not null,
author_dob date null,
author_image_url varchar(150),
primary key (author_id)
);

-- alter table
ALTER TABLE author
ADD test_data varchar(100) after author_image_url,
modify author_image_url varchar(300); 

ALTER TABLE author
drop column test_data,
modify author_image_url varchar(300);

-- add data
Insert Into author(author_id,author_name,author_dob,author_image_url)
values(1,"Nilesh",'2000-03-25',"www.google.com"),
(2,"Prasad",'2002-10-20',"www.google.com/p");

-- update record
Update author set author_name="USER3",author_dob='2000-07-12' where author_id=3;
Update author set author_name="USER4",author_dob='2000-07-12' where author_id=4;

-- delete records
Delete from author where author_id = 3;
Delete from author where author_id = 4; -- try to delete even id not present it will not give any error

-- truncate table
truncate table author;
-- drop table
drop table author;
