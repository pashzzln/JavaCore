-- создание таблицы с данными пользователя

-- Table: public.users

-- DROP TABLE IF EXISTS public.users;

CREATE TABLE IF NOT EXISTS public.users --таблица создается ЕСЛИ она еще не создана
(
    id bigint NOT NULL, --id
    name character varying COLLATE pg_catalog."default" NOT NULL, --имя
    surname character varying COLLATE pg_catalog."default" NOT NULL, --фамилия
    CONSTRAINT users_pkey PRIMARY KEY (id) --id обьявлен первичиным ключом
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.users
    OWNER to postgres;

--заполнение таблицы

INSERT INTO users (id, name, surname)
VALUES (1, 'Pavel', 'Zelenov');
INSERT INTO users (id, name, surname)
VALUES (2, 'Ivan', 'Ivanov');
INSERT INTO users (id, name, surname)
VALUES (3, 'Sergey', 'Zhukov');
INSERT INTO users (id, name, surname)
VALUES (4, 'Kirill', 'Samoylov');
INSERT INTO users (id, name, surname)
VALUES (5, 'Daniil', 'Krasnov');
INSERT INTO users (id, name, surname)
VALUES (6, 'Vladimir', 'Olegov');
INSERT INTO users (id, name, surname)
VALUES (7, 'Vladislav', 'Belov');
INSERT INTO users (id, name, surname)
VALUES (8, 'Dmitriy', 'Zelenov');
INSERT INTO users (id, name, surname)
VALUES (9, 'Igor', 'Bolshev');
INSERT INTO users (id, name, surname)
VALUES (10, 'Olga', 'Nenova')

-- создание таблицы с данными продуктов

-- Table: public.products

-- DROP TABLE IF EXISTS public.products;

CREATE TABLE IF NOT EXISTS public.products --таблица создается ЕСЛИ она еще не создана
(
    id bigint NOT NULL, --id
    description character varying COLLATE pg_catalog."default" NOT NULL, --описание
    price numeric NOT NULL, --цена
    quantity integer NOT NULL, --количество
    CONSTRAINT products_pkey PRIMARY KEY (id) --id обьявлен первичиным ключом
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.products
    OWNER to postgres;

--заполнение таблицы

INSERT INTO products (id, description, price, quantity)
VALUES (1, 'Milk', 50, 1000);
INSERT INTO products (id, description, price, quantity)
VALUES (2, 'Cake', 1500, 100);
INSERT INTO products (id, description, price, quantity)
VALUES (3, 'Bread', 25, 5000);
INSERT INTO products (id, description, price, quantity)
VALUES (4, 'Water', 45, 250);
INSERT INTO products (id, description, price, quantity)
VALUES (5, 'Bubble gum', 10, 10000);
INSERT INTO products (id, description, price, quantity)
VALUES (6, 'Ice cream', 120, 200);
INSERT INTO products (id, description, price, quantity)
VALUES (7, 'Meat', 600, 100);
INSERT INTO products (id, description, price, quantity)
VALUES (8, 'Fish', 800, 100);
INSERT INTO products (id, description, price, quantity)
VALUES (9, 'Coca-cola', 80, 50);
INSERT INTO products (id, description, price, quantity)
VALUES (10, 'Snickers', 79, 50);

-- создание таблицы с данными заказов

-- Table: public.orders

-- DROP TABLE IF EXISTS public.orders;

CREATE TABLE IF NOT EXISTS public.orders
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ), --id + автогенерация
    user_id bigint NOT NULL, --id пользователя
    product_id bigint NOT NULL, --id продукта
    quantity integer NOT NULL, --количество
    order_date date NOT NULL, --дата
    CONSTRAINT orders_pkey PRIMARY KEY (id), --id обьявлен первичиным ключом
    CONSTRAINT fk_product_id FOREIGN KEY (product_id) --id продукта обьявлен внешним ключом
        REFERENCES public.products (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fk_user_id FOREIGN KEY (user_id) --id пользователя обьявлен внешним ключом
        REFERENCES public.users (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.orders
    OWNER to postgres;

--заполнение таблицы

INSERT INTO orders (product_id, user_id, order_date, quantity)
VALUES(2, 1, '2024-07-11 12:00:00', 3);
INSERT INTO orders (product_id, user_id, order_date, quantity)
VALUES(9, 1, '2024-07-11 12:00:00', 10);
INSERT INTO orders (product_id, user_id, order_date, quantity)
VALUES(10, 1, '2024-07-11 12:00:00', 15);
INSERT INTO orders (product_id, user_id, order_date, quantity)
VALUES(4, 5, '2024-02-15 10:30:24', 1);
INSERT INTO orders (product_id, user_id, order_date, quantity)
VALUES(5, 9, '2023-11-11 07:30:56', 2);
INSERT INTO orders (product_id, user_id, order_date, quantity)
VALUES(7, 3, '2024-09-01 16:25:23', 1);
INSERT INTO orders (product_id, user_id, order_date, quantity)
VALUES(8, 3, '2024-09-01 16:25:23', 1);
INSERT INTO orders (product_id, user_id, order_date, quantity)
VALUES(3, 2, '2024-05-05 22:12:42', 2);
INSERT INTO orders (product_id, user_id, order_date, quantity)
VALUES(6, 3, '2024-06-01 16:56:34', 1);
INSERT INTO orders (product_id, user_id, order_date, quantity)
VALUES(9, 3, '2024-02-01 12:53:34', 1);

--1