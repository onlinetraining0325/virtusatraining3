drop database if exists virtusa3;

create database virtusa3;

use virtusa3;

Create Table Employ
(
   Empno INT Primary Key,
   Name varchar(30) NOT NULL,
   Gender ENUM('MALE','FEMALE'),
   Dept varchar(30),
   Desig varchar(30),
   Basic Numeric(9,2)
);

Insert into Employ(Empno,Name,Gender,Dept,Desig,Basic)
values(1,'Lokesh','MALE','Java','Expert',88323),
(2,'Shaili','FEMALE','Sql','Dba',88653),
(3,'SaiKarthik','MALE','Java','Manager',99999),
(4,'Junaid','MALE','Sql','Expert',98323),
(5,'Indu','FEMALE','Java','Expert',88222)