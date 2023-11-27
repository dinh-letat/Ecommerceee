create database ecommerce;
use ecommerce;

alter table Product add column productImg LONGBLOB ;

create table User(
	user_id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(50) NOT NULL
);

create table Product(
	product_id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    productImg LONGBLOB NOT NULL,
    productCode VARCHAR(50) NOT NULL,
    productName VARCHAR(255) NOT NULL,
    categories VARCHAR(255) NOT NULL,
    productType VARCHAR(255) NOT NULL,
    insertDate DATE,
    quantity INT NOT NULL,
    price double NOT NULL
);

-- user 
insert into User(username, email, password, role) values ('admin', 'admin@gmail.com', 'adminpassword', 'ADMIN');
insert into User(username, email, password, role) values ('user', 'user@gmail.com', 'userpassword', 'USER');


-- products
insert into product(product_id, productImg, productCode, productName, categories, productType, insertDate, quantity, price) 
values(1, '', 'BN0010', 'Bánh Đường Đen', 'Bánh', 'Bánh ngọt', '2023-12-25', 120, 1200000); 

insert into product(product_id, productImg, productCode, productName, categories, productType, insertDate, quantity, price) 
values(2, 'https://cdn.tgdd.vn/2021/06/CookProduct/bqtm-1200x676.jpg', 'BG002', 'Bánh Cam', 'Bánh', 'Bánh ngọt', '2023-12-15', 50, 200000);




