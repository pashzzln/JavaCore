--sql запросы к таблице users

--чтение данных

SELECT * FROM users; --чтение всех данных

SELECT name FROM users --чтение всех имен пользователей, чей id больше 5
WHERE id>5;

SELECT id, name FROM users --чтение всех id и имен пользователей с фамилией "Zelenov"
WHERE surname = 'Zelenov';

--изменение данных

UPDATE users SET --изменение имени на "Pasha" у пользователя с id = 1
name = 'Pasha'
Where name = 1;

UPDATE users SET --изменение фамили на "Ivanchenko" у пользователя с именем "Ivan"
surname = 'Ivanchenko'
Where name = 'Ivan';

UPDATE users SET --измененике фамилии и имени на "Oleg Nenov" у пользователя с фи "Olga Nenova"
name = 'Oleg', surname = 'Nenov'
Where name = 'Olga' AND surname = 'Nenova';

--удаление данных

DELETE FROM users --удаление пользователей с четным id
WHERE id%2=0;

DELETE FROM users --удаление всех пользователей с фамилией "Zelenov"
WHERE surname = 'Zelenov';







--sql запросы к таблице products

--чтение данных

SELECT * FROM products; --чтение всех данных

SELECT * FROM products --чтение всех продуктов с нечетным id
WHERE id%2!=0;

SELECT * FROM products --чтение всех продуктов с ценой меньше 500
WHERE price<500;

SELECT * FROM products -- чтение всех продуктов с наличием больше 200 штук
WHERE quantity>200;

--изменение данных

UPDATE products SET --изменение цены с 50 до 75 у продукта с наименованием молоко
price = 75
WHERE description = 'Milk';

UPDATE products SET --изменение наличия товара на 50 у всех товаров с ценной меньше 100
quantity = 50
WHERE price < 100;

--удаление данных

DELETE FROM products --удаление всех товаров с наличием 50
WHERE quantity =50;

DELETE FROM products --удаление товара с именем "Fish"
WHERE description = 'Fish';







--sql запросы к таблице orders

--чтение данных

SELECT * FROM orders; --чтение всех данных

SELECT orders.*, users.name FROM orders --чтение всех имен пользователей, которые сделали заказ
JOIN users ON users.id = orders.user_id;

SELECT orders.*, users.name FROM orders --чтение всех имен пользователей, которые сделали заказ(+ те, кто не делал заказ)
FULL OUTER JOIN users ON users.id = orders.user_id;

--изменение данных

UPDATE orders SET -- изменеие даты с 11 июля на 12 июля во всех заказах
order_date = '2024-07-12'
WHERE order_date = '2024-07-11';

UPDATE orders SET --изменение количества купленного товара на 2 у всех заказов с товаром с id равным 9
quantity = 2
WHERE product_id = 9;

--удаление данных

DELETE FROM orders --удаление всех заказов с количеством купленного товара равным 1
WHERE quantity = 1;

DELETE FROM orders --удаление всех заказов с id пользователя равным 2
WHERE user_id = 2;

DELETE FROM orders --удаление всех заказов с датой 12 июля 24 года
WHERE order_date = '2024-07-12';


