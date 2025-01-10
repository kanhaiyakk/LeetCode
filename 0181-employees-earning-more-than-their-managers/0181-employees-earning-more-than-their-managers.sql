# Write your MySQL query statement below
SELECT E1.name AS Employee
FROM EMPLOYEE E1
 JOIN EMPLOYEE E2
ON E1.ManagerId =E2.Id AND E1.SALARY>E2.SALARY;
