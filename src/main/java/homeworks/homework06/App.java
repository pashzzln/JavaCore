package homeworks.homework06;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] splitPeople = sc.nextLine().split("; ");
        Person[] people = new Person[splitPeople.length];
        for (int i = 0; i < splitPeople.length; i++) {
            String[] nameMoney = splitPeople[i].split(" = ");
            people[i] = new Person(nameMoney[0], Integer.parseInt(nameMoney[1]));
        }
//        for (int i = 0; i < people.length; i++) {
//            System.out.println("Name - " + people[i].getName() + ", Money - " + people[i].getMoney());
//        }
//        Проверка наполняемости

        String[] products0 = sc.nextLine().split("; ");
        Product[] products = new Product[products0.length];
        for (int i = 0; i < products0.length; i++) {
            String[] nameCost = products0[i].split(" = ");
            products[i] = new Product(nameCost[0], Integer.parseInt(nameCost[1]));
        }

//        for (int i = 0; i < products.length; i++) {
//            System.out.println("Name - " + products[i].getName() + ", Cost - " + products[i].getCost());
//        }
//        Проверка наполняемости

        String end = "";

        while(end!="END"){
            end = sc.nextLine();
            String[] buying = end.split(" - ");
            for (int i = 0; i < people.length; i++) {
                if (people[i].getName().equals(buying[0])){
                    for (int j = 0; j < products.length; j++) {
                        if (products[j].getName().equals(buying[1])){
                            people[i].buy(products[j]);
                        }
                    }
                }
            }
        }

    }
}

/* Павел Андреевич = 10000; Анна Петровна = 2000; Борис = 10
Хлеб = 40; Молоко = 60; Торт = 1000; Кофе растворимый = 879; Масло = 150

Павел Андреевич - Хлеб
Павел Андреевич - Масло
Анна Петровна - Кофе растворимый
Анна Петровна - Молоко
Анна Петровна - Молоко
Анна Петровна - Молоко
Анна Петровна - Торт
Борис - Торт
Павел Андреевич - Торт
END

Павел Андреевич купил Хлеб
Павел Андреевич купил Масло
Анна Петровна купила Кофе растворимый
Анна Петровна купила Молоко
Анна Петровна купила Молоко
Анна Петровна купила Молоко
Анна Петровна не может позволить себе Торт
Борис не может позволить себе Торт
Павел Андреевич купил Торт
Павел Андреевич - Хлеб, Масло, Торт; Анна   Петровна   -   Кофе   растворимый,Молоко, Молоко, Молоко; Борис -  Ничего не куплено


Женя = 0
Мороженое = 200
Женя Мороженое
END

Женя    не   может   позволить   себе Мороженое
Женя -  Ничего не куплено


Света = -3
Макароны = 800;
Света Макароны
END

Деньги не могут быть отрицательны */
