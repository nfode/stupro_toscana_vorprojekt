create database taskdb;
go
create table taskdb.tasks
   (id int not null unique auto_increment,
      task varchar(255),
      primary key (id)
   );
