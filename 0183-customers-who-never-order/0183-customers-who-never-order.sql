# Write your MySQL query statement below
select c.name as Customers
from Customers c
left join Orders o
on c.id=o.customerId 
WHERE o.id IS NULL;



