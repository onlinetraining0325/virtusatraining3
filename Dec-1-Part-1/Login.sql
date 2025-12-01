SELECT * FROM virtusa3.employ;

create table login
(
   userName varchar(30) primary key,
   passCode varchar(30)
);

Insert into Login(UserName,PassCode) 
values('Lokesh','Punwani'),('Subham','Pathak'),
('Anusri','Kamidri'),('Akshitha','Merugu');

select count(*) cnt from Login
where userName='Lokesh' AND Passcode='Punwani';
