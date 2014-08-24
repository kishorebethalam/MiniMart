create database pos;
connect pos;
create table category (
	id int not null primary key auto_increment,
	name varchar(128),
	parent_category_id int not null default 0
);

create table manufacturer (
	id int not null primary key auto_increment,
	name varchar(128)
);


create table brand (
	id int not null primary key auto_increment,
	name varchar(128),
	manufacturer_id int not null,
	foreign key (manufacturer_id) references manufacturer(id)
);

create table product_master (
	id int not null primary key auto_increment,
	name varchar(128),
	brand_id int not null,
	category_id int not null,
	foreign key (brand_id) references brand(id),
foreign key (category_id) references category(id)
);

create table product (
	id int not null primary key auto_increment,
product_master_id int not null,
	measurement_category varchar(32),
	measurement_quantity int not null,
	mrp float not null,
	selling_price float not null,
bought_price float not null,
	reorder_volume int not null,
	reorder_frequency int not null,
	foreign key (product_master_id) references product_master(id)
);

create table inventory_item (
	id int not null primary key auto_increment,
product_id int not null,
	name varchar(128), 
tracking_code varchar(32),
quantity int not null,
received_date timestamp not null,
expiry_date timestamp,
promotional_offer varchar(256),
	foreign key (product_id) references product(id)

);

insert into manufacturer(id,name) values (1, 'manufacturer1');
insert into brand (id, manufacturer_id, name) values (1, 1, 'brand1');
