package homeworks.homework06;

import java.util.Arrays;
import java.util.Objects;

public class Person {
    private String name;
    private int money;
    private Product[] bucket = new Product[100];

    public Person(String name, int money) {
        if (name == null || name == "" || name == " ") {
            throw new IllegalArgumentException("Имя не может быть пустой строкой");
        } else {
            this.name = name;
        }
        if (money < 0) {
            throw new IllegalArgumentException("Деньги не могут быть отрицательными");
        } else {
            this.money = money;
        }
    }


    public String checkout(Person person) {
        String r;
        r = person.getName() + " - ";
        for (int i = 0; i < person.getBucket().length; i++) {
            r = r + person.getBucket()[i];
        }
        return r;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Product[] getBucket() {
        return bucket;
    }

    public void setBucket(Product[] bucket) {
        this.bucket = bucket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return money == person.money && Objects.equals(name, person.name) && Arrays.equals(bucket, person.bucket);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, money);
        result = 31 * result + Arrays.hashCode(bucket);
        return result;
    }

    @Override
    public String toString() {
        return "Person {" +
                "name = '" + name + '\'' +
                ", money = " + money +
                ", bag = " + Arrays.toString(bucket) +
                '}';
    }
}

/* 1. Создать классы Покупатель (Person) и Продукт (Product).

Характеристики Покупателя: имя, сумма денег и  пакет с продуктами(массив объектов типа Продукт). ||
Имя не может быть пустой строкой. ||
Деньги не могут быть отрицательным числом. ||
Если Покупатель может позволить себе Продукт, то Продукт добавляетсяв пакет. ||
Если у Покупателя недостаточно денег, то добавление не происходит. ||

Характеристики Продукта: название и стоимость. ||
Название продукта неможет быть пустой строкой, оно должно быть. ||
Стоимость продукта не может быть отрицательным числом. ||

2. Поля в классах должны быть private, доступ к полям осуществляется через геттеры и сеттеры или конструктор класса. ||

3. В классах переопределены методы toString(), equals(), hashcode(). ||

4.  Создать в классе  App  метод  main  и проверить работу приложения.  ||
Данные   Покупателей   и   Продукты   вводятся   с   клавиатуры   или   задаются случайным образом. ||
Продукты в цикле выбираются покупателями по очередии, пока не введено слово END, наполняется пакет. ||

5. Обработать следующие ситуации:
 а. Если   покупатель   не   может   позволить   себе   продукт,   тонапечатайте   соответствующее   сообщение   ("[Имя   человека]   не   может позволить себе [Название продукта]"). ||
 б. Если ничего не куплено, выведите имя человека, за которым следует "Ничего не куплено".
 в. В случае неверного ввода (сообщение об исключении: "Деньги не могут   быть   отрицательными")   или   пустого   имени:   (сообщение   обисключении: "Имя не может быть пустым").

6. Программа реализуется в отдельной ветке git homeworks/homework06.
При   сохранении   состояния   программы   (коммиты)   пишется   сообщение с описанием хода работы по задаче.
В корне папки с программой должен быть файл .gitignore.
Программа локально коммитится и публикуется в репозиторий GitHub напроверку.*/