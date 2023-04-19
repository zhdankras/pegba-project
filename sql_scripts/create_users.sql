create table users 
(
	id varchar(36) primary key not null default (uuid()),
	first_name varchar(36) not null,
	last_name varchar(36),
	email varchar(36) not null,
	cart_id varchar(36),
	foreign key (cart_id) references carts (id)
);