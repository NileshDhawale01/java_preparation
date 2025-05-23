use test;

-- query's

select * from data_store;

-- secound largest salary
-- 1 using distinct limit offset
-- distinct skip duplicate price record so we get unique record of price
-- limit get define number of records from result
-- offset skip the define number of record from first
select distinct price,data_id,data_type,data_about
from data_store
limit 1 offset 1;

-- 2. sub query
select max(price) from data_store
where price<(select max(price) from data_store);

select * from data_store
where price = (select max(price) from data_store
where price<(select max(price) from data_store));
-- limit 1 offset 1; 

-- n'th largest
-- 1 use distinct linit offset
select distinct price from data_store
order by price desc
limit 1 offset 2; -- use offset number as n-1 (here we get third largest salary :: n-1)