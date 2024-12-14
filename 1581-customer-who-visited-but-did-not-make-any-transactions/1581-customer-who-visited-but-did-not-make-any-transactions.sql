# Write your MySQL query statement below
select 
   v.customer_id,
   Count(*) as count_no_trans
from 
   Visits v
left join 
   Transactions t
on 
   v.visit_id = t.visit_id
WHERE
   t.transaction_id is null
group by
   v.customer_id
order by
   v.customer_id;

