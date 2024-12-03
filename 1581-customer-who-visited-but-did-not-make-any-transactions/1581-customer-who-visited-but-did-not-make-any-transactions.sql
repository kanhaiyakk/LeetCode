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

# SELECT 
#     v.customer_id,
#     COUNT(*) AS count_no_trans
# FROM 
#     Visits v
# LEFT JOIN 
#     Transactions t
# ON 
#     v.visit_id = t.visit_id
# WHERE 
#     t.transaction_id IS NULL
# GROUP BY 
#     v.customer_id
# ORDER BY 
#     v.customer_id;
