package homeworks.homework11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String[] carConstructor = sc.nextLine().split("|");
            cars.add(new Car(carConstructor[0], carConstructor[1], carConstructor[2], Integer.valueOf(carConstructor[3]), Integer.valueOf(carConstructor[4])));
        }
        System.out.println(cars.toString());
    }
}
