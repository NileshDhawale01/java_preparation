use test;

-- joins in many to many

-- 1. inner join -- only matched data
select u.user_id,u.user_name,r.role_id,r.role_name
from 
user as u inner join user_role as ur
on u.user_id=ur.user_id
inner join role as r
on r.role_id=ur.role_id;

-- 2. left join -- all data from left table + matched data
select u.user_id,u.user_name,r.role_id,r.role_name
from
user as u left join user_role as ur
on u.user_id = ur.user_id
left join role as r
on r.role_id=ur.role_id;

-- 3. right join -- all data from right table + matched data
select u.user_id,u.user_name,r.role_id,r.role_name
from
user as u right join user_role as ur
on u.user_id = ur.user_id
right join role as r
on r.role_id = ur.role_id;

-- 4. full outer join -- all data from left table + matched data + all data from right table
-- MySQL not support full outher join!!
select u.user_id,u.user_name,r.role_id,r.role_name
from
user as u left join user_role as ur
on u.user_id = ur.user_id
left join role as r
on r.role_id=ur.role_id
union
select u.user_id,u.user_name,r.role_id,r.role_name
from
user as u right join user_role as ur
on u.user_id=ur.user_id
right join role as r
on r.role_id=ur.role_id;