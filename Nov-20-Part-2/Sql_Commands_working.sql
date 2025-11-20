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

