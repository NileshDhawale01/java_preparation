use test;

-- one to many join operations
-- one author many books

-- 1. inner joins -- matched records only
select a.author_id,a.author_name,b.book_id,b.book_name
from author as a  inner join books as b
on a.author_id=b.author_id;

-- 2. left join -- all data from left table + matched data
select a.author_id,a.author_name,b.book_id,b.book_name
from author as a left join books as b
on a.author_id  = b.author_id;

-- 3. right join -- all data from right table + matched data
select a.author_id,a.author_name,b.book_id,b.book_name
from author as a right join books as b
on a.author_id = b.author_id;

-- 4. full outer join -- all data from left table + matched data + all data from right table -- all data
-- MySQL not support full outer join
-- to use union has to be same number of fields
-- having the same order of of select column is good practice
select a.author_id,a.author_name,b.book_id,b.book_name
from author as a left join books as b
on a.author_id = b.author_id
union
select a.author_id,a.author_name,b.book_id,b.book_name
from author as a right join books as b
on a.author_id = b.author_id;

