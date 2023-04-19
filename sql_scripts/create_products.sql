create table products
(
	id varchar(36) primary key not null default (uuid()),
	name varchar(36) not null,
	category_id varchar(36) not null,
	organization_id varchar(36) not null,
	amount int,
	foreign key (category_id) references categories (id),
	foreign key (organization_id) references organizations (id) 
);