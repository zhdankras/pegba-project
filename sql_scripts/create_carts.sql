create table carts
(
	id varchar(36) primary key not null default (uuid()),
	product_id varchar(36),
	amount_products integer not null,
	foreign key (product_id) references products (id) 
);