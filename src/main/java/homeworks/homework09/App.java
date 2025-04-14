package homeworks.homework09;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Car car1 = new ShowCar();
        PerformanceCar car2 = new PerformanceCar("BMW", "M5", 2023, 100, 75, 4, 3);
        car2.setAddOns(new String[]{"Cool wheel, Cool seat"});
        System.out.println("PerformanceCar - " + car2.toString());
        System.out.println("ShowCar - " + car1.toString());
        System.out.println("");

        Garage garage1 = new Garage(100);
        garage1.parkCar(car1);
        garage1.parkCar(car2);
        System.out.println("Гараж - " + garage1.toString());
        System.out.println("");

        ArrayList<Car> carss = new ArrayList<>();
        carss.add(car1);
        carss.add(car2);
        Race r1 = new Race();
        Race r2 = new Race(10000, "Irkutsk, Russia", 100000, carss);
        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }
}

/*Каждый из представленных классов должен включать:
1. Конструктор пустой и с параметрами;
2. Переопределенный метод toString();
3. Геттеры и сеттеры для полей. Обратить внимание, что поля требуется сделать private;
4. У классов переопределены методы equals() и hashcode().
Работу с классами проверить в методе main класса App.*/