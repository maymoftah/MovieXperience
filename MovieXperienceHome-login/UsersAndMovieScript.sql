create database SSDI;
use SSDI;

create table user_details(user_id INT(10),email_id varchar(50), 
first_name varchar(50), last_name varchar(50), password varchar(50),
 primary key(user_id));
 
 insert into user_details values(1,"triveni@uncc.edu","triveni","shetty","triv@123");
 insert into user_details values(2,"deepika@uncc.edu","deepika","maniyil","deep@123");
 insert into user_details values(3,"vivek@uncc.edu","vivek","ravi","vive@123");
 insert into user_details values(4,"mai@uncc.edu","mai","moftah","mai@123");
 
 select * from user_details;
 
 
 create table movie_details(movie_id INT(10),movie_name varchar(50), 
movie_genre varchar(50), release_date date,
 primary key(movie_id));
 
insert into movie_details values(1,"Titanic","Romance",'1999-01-01');
insert into movie_details values(2,"Hulk","Action",'2005-01-01');
insert into movie_details values(3,"Deadpool","Comedy",'2016-01-01');
insert into movie_details values(4,"Conjuring","Horror",'2014-01-01');
    
select * from movie_details;
  
  
  
  
  
  
  