create database  if not exists E_commerce_website;
use E_commerce_website;
create table  Supplier(Supp_id int primary key,
                       Supp_name varchar(50) not null,
                       Supp_city varchar(30) not null,
                       Supp_phone varchar(15) not null
                       );
create table    Customer(Cus_id int primary key,
                      Cus_name varchar(20) not null,
                       Cus_city varchar(10) not null ,
                       Cus_phone varchar(30) not null,
                       Cus_gender char
                       );   
create table   Category(Cat_id int primary key,
                      Cat_name varchar(20) not null
                      );
create table   Products(Pro_id int primary key,
                      Pro_name varchar(20) not null default 'dummy',
                      Pro_desc varchar(60) ,
                      Cat_id int,
                      foreign key (Cat_id) references Category (Cat_id)
                       );
 create  table  if not exists Supplier_pricing(Pricing int primary key,
                                 Pro_id int,
                                 Supp_id int,
                                 Supp_price int default 0,
                                 foreign key (Pro_id) references   Products (Pro_id),
                                 foreign key (Supp_id) references  Supplier(Supp_id) 
                                 );
 create table  Orders (Order_id int primary key,
                      Order_amount int not null,
                      Order_date date not  null,
                      Cus_id int,
                      foreign key (Cus_id) references Customer(Cus_id)
                      );
create table  Ratings (Rat_id int primary key,
                      Order_id int ,
                      Rat_ratstars int not null,
                      foreign key (Order_id) references Order_table(Order_id)
                      );
                      
 
                                                
                       
          