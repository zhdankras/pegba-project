insert into products (
	id,
	name,
	category_id,
	amount,
	organization_id
)
values
(uuid(), 'English tutorial', (select id from categories where name='Electronics'), 3, (select id from organizations where name='RUS-Export')),
(uuid(), 'Spanish dictionary', (select id from categories where name='Books'), 2, (select id from organizations where name='RUS-Export'));