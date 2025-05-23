use test;
-- foreign key matching (similar inner join)
select a.author_id,author_name,book_id,book_name
from author as a,books as b
where a.author_id=b.author_id;

-- joins
-- 1. inner join -- give only matches result
select a.author_id,a.author_name,b.book_id,b.book_name
from author as a inner join books as b
on a.author_id=b.author_id;

-- 2. left join -- matched data + data from left table
select a.author_id,a.author_name,b.book_id,b.book_name
from author as a left join books as b
on a.author_id = b.author_id;

-- 3. right join -- matched data + data form right table
select a.author_id,a.author_name,b.book_id,b.book_name
from author as a right join books as b
on a.author_id = b.author_id;

-- 4. outer join -- give data from left table + mached data + data from right table -- All data
-- we did like this because MySQL not support full join directly!
select a.author_id,a.author_name,b.book_id,b.book_name
from author as a left join books as b
on a.author_id = b.author_id
union
select a.author_id,a.author_name,b.book_id,b.book_name
from author as a right join books as b
on a.author_id = b.author_id;