
create table teams(
id bigint auto_increment not null,
name varchar(100) not null,
country varchar(100) not null, 
manager varchar(100),
logo varchar(100) not null,
primary key (id));