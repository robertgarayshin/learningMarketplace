create table users
(
    id      serial primary key,
    name    varchar(40),
    surname varchar(50),
    email   varchar(50),
    avatar  varchar,
    phone   varchar(15)
);
create table items
(
    id   serial primary key,
    name varchar,
    price int,
    photo varchar,
    quantity int,
    description text
);

create table card
(
    user_id int,
    item_id int,
    constraint user_fk foreign key(user_id) references users(id),
    constraint item_fk foreign key(item_id) references items(id)
);

create table orders
(
    id serial primary key,
    user_id int,
    item_id int,
    constraint user_fk foreign key(user_id) references users(id),
    constraint item_fk foreign key(item_id) references items(id),
    status varchar,
    date_created timestamp
)
