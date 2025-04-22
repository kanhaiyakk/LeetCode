# Write your MySQL query statement below
select d.name AS Department, e.name AS Employee, e.salary AS Salary
from  Employee e
join Department  d on e.departmentId  =d.id
where (e.salary,e.departmentId ) in(
    select max(salary),departmentId 
    from employee
    group by departmentId 
);
