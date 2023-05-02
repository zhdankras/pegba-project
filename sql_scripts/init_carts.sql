insert into carts (
	id,
	product_id,
	amount_products
)
values
(uuid(), (select id from products where name='English tutorial'), 1),
(uuid(), (select id from products where name='Spanish dictionary'), 1);