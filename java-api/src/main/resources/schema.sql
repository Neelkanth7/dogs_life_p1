create table IF NOT EXISTS owners
(
    id int auto_increment PRIMARY KEY,
    name varchar (50) not null
);

create table IF NOT EXISTS  dogs
(
    id int auto_increment PRIMARY KEY,
    name varchar (50) not null,
    age varchar (20) not null,
    owner_id int not null,
    FOREIGN key (owner_id) REFERENCES owners (id)
);

INSERT into owners
    (id,name)
values
    (1,'Bruce Wayne')

INSERT into dogs
    (id,name,age,owner_id)
values
    (1,'sir barksalot',2,1)
