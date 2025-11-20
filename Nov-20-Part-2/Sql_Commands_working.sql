-- How to change to the database

use virtusa;

-- Display List of tables in current db 

show tables;

-- Display Info. about Emp table 

Desc Emp;

-- Display Info. about Dept Table 

Desc Dept;

-- Display all records from Emp table

select * from Emp;

-- Display Empno, Ename, job, sal, hiredate from Emp table 

select empno, ename, job, sal, hiredate
from Emp;

-- Where clause : Used to display records based on the condition 

-- Display all records whose job is 'CLERK' 

select * from Emp where job='CLERK';

-- Display all records whose sal > 2000

select * from Emp where sal > 2000;

-- Display all records whose Ename is 'KING'

select * from Emp where Ename='KING'; 

-- Between...AND : used to display records from start to end 

select * from Emp where sal between 1000 and 3000;

select * from Emp where sal not between 1000 and 3000;

-- IN Clause : used to check for multiple values of particular attribute 

select * from Emp where job in('CLERK','MANAGER','SALESMAN');

select * from Emp where ENAME in('SMITH','ALLEN','WARD','MARTIN');

-- LIKE operator : Used to display data w.r.t. Wild cards 

select * from Emp where ename like 'S%';

-- Display records whose name ends with 'S';

select * from Emp where ename like '%S';

-- Order By : Used to display data w.r.t. Specific field(s) in ascending or descending order

select Empno,ename,job,sal,hiredate,comm from Emp 
order by ename;

select Empno,ename,job,sal,hiredate,comm from Emp 
order by sal desc;

select Empno,ename,job,sal,hiredate,comm from Emp 
order by job, ename;

-- Write a query as Based on job u need to specify reporting city 
-- as for 'CLERK' 'Hyderabad' for 'MANAGER' 'Delhi' 
-- for 'ANALYST' 'Pune' for 'SALESMAN' 'Chennai'
-- for 'PRESIDENT' 'Any Branch' 

select empno, ename, job,sal,hiredate,comm,
case job
  WHEN 'CLERK' THEN 'Hyderabad'
  WHEN 'MANAGER' THEN 'Delhi'
  WHEN 'ANALYST' THEN 'Pune'
  WHEN 'SALESMAN' THEN 'Chennai'
  WHEN 'PRESIDENT' THEN 'Any Branch'
end 'Reporting City'
from Emp;

-- Write a query as give incr in sal as 
-- as for 'CLERK' Incr by 500 for 'MANAGER' incr by 2000
-- for 'ANALYST' Incr by 1500 for 'SALESMAN' Incr by 1000
-- for 'PRESIDENT' No Incr 


select empno, ename, job,sal,hiredate,comm,
case job
  WHEN 'CLERK' THEN sal + 500
  WHEN 'MANAGER' THEN sal + 2000
  WHEN 'ANALYST' THEN sal + 1500
  WHEN 'SALESMAN' THEN Sal + 1000
--   WHEN 'PRESIDENT' THEN 'Any Branch'
end 'Increment'
from Emp;

-- Write a query to replace NULL with value 0

select empno, ename, job,sal,hiredate,comm,
case 
when comm is NULL then 0 else comm end 'Updated Comm'
from Emp;

-- Write a Query to Make TakeHome as Sal + comm 

select empno, ename, job,sal,hiredate,comm,
case 
when comm is NULL then 0 else comm end 'Updated Comm',
case 
  WHEN comm is NULL THEN SAL ELSE SAL + COMM 
end 'TakeHome'
from Emp;

-- How to eliminate duplicate entries at the time of display 

select job from Emp;

select distinct job from Emp;

-- Aggregate Functions 

-- sum() : performs the sum operation on the field specified 

select sum(sal) from EMp;

-- avg() : Performs avg operation on the field specified 

select avg(sal) from Emp; 

-- max() : Performs max operation on the field specified 

select max(sal) from emp; 

-- min() : Performs min operation on the field specified 

select min(sal) from Emp;  

-- count(*) : Displays total records of particular table 

select count(*) from Emp;

-- Group By : Allows you to generate summary reports on the field(s) speified. 

select job,sum(sal) from Emp
group by job; 

select job, count(*) from Emp
group by job;

-- Display dept-wise max salary 

select job,max(sal) from Emp
group by job;

select job,sum(sal),avg(sal),max(sal),min(sal),count(*)
from Emp 
Group by job;
