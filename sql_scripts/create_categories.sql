create table categories
(
	id varchar(36) primary key not null default (uuid()),
	name varchar(36) not null
);