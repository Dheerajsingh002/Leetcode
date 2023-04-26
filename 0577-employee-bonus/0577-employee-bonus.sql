# Write your MySQL query statement below
select emp.name,bon.bonus from Employee emp left  join Bonus bon on emp.empId=bon.empId  where bonus<1000 or bonus is null; 
