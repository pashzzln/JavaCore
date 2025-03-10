package homeworks.homework08;

import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/main/java/homeworks/homework08/inp.txt"));
        String[] splitPeople = br.readLine().split("; ");
        Person[] people = new Person[splitPeople.length];
        for (int i = 0; i < splitPeople.length; i++) {
            String[] nameMoney = splitPeople[i].split(" = ");
            people[i] = new Person(nameMoney[0], Integer.parseInt(nameMoney[1]));
        }
//        for (int i = 0; i < people.length; i++) {
//            System.out.println("Name - " + people[i].getName() + ", Money - " + people[i].getMoney());
//        }
        //Проверка наполняемости

        String[] products0 = br.readLine().split("; ");
        Product[] products = new Product[products0.length];
        for (int i = 0; i < products0.length; i++) {
            String[] nameCost = products0[i].split(" = ");
            products[i] = new Product(nameCost[0], Integer.parseInt(nameCost[1]));
        }

//        for (int i = 0; i < products.length; i++) {
//            System.out.println("Name - " + products[i].getName() + ", Cost - " + products[i].getCost());
//        }
        //Проверка наполняемости


        String end = br.readLine();
        int a = 0;
        String[] exitMessage = new String[100];
        while(!(end.equals("END"))){
            String[] buying = end.split(" - ");
            for (int i = 0; i < people.length; i++) {
                if (people[i].getName().equals(buying[0])){
                    for (int j = 0; j < products.length; j++) {
                        if (products[j].getName().equals(buying[1])){
                            if(people[i].getMoney()>=products[j].getCost()){
                                people[i].getBucket()[a] = products[j];
                                people[i].setMoney(people[i].getMoney()-products[j].getCost());
                                exitMessage[a] = people[i].getName() + " купил " + products[j].getName();
                                a++;
                            } else {
                                exitMessage[a] = people[i].getName() + " не может позволить себе " + products[j].getName();
                                a++;
                            }
                        }
                    }
                }
            }
            end = br.readLine();
        }
        br.close();


        BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/java/homeworks/homework08/out.txt"));

        for(int i = 0; i < exitMessage.length; i++){
            if(exitMessage[i]!=null){
                bw.write(exitMessage[i] + "\n");
                bw.flush();
            }
        }

        for(int i = 0; i < people.length; i++){
            boolean s = true;
            bw.write(people[i].getName() + " - ");
            bw.flush();
            for (int j = 0; j < 100; j++) {
                if(people[i].getBucket()[j] != null){
                    s = false;
                    bw.write(people[i].getBucket()[j].getName() + ", ");
                    bw.flush();
                }
            }
            if(s){
                bw.write(" ничего не куплено");
                bw.flush();
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
Женя - Мороженое
END

Женя    не   может   позволить   себе Мороженое
Женя -  Ничего не куплено


Света = -3
Макароны = 800;
Света Макароны
END

Деньги не могут быть отрицательны */
