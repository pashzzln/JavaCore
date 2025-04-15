package homeworks.homework11;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            String[] carConstructor = sc.next().split("[|]");
            if(carConstructor[0].equals("END")) break;
            System.out.println(Arrays.toString(carConstructor));
            cars.add(new Car(carConstructor[0], carConstructor[1], carConstructor[2], parseInt(carConstructor[3]), parseInt(carConstructor[4])));
        }
        System.out.println(cars.toString());
        System.out.println("Plate         Model         Color        Mileage         Cost");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i).getPlate() + "        " + cars.get(i).getModel() + "        " + cars.get(i).getColor() + "        " + cars.get(i).getMileage() + "        "  + cars.get(i).getCost() + "        ");
        }
        int minCost = cars.stream()
                .map(car -> car.getCost())
                .toList()
                    .stream()
                        .min(Integer::compare)
                        .get();
        String color = null;
        for (Car car : cars){
            if(car.getCost() == minCost)
                color = car.getColor();
        }
        System.out.println("Цвет автомобиля с минимальной стоимостью: " + color);

        String modelToFind = "Toyota";
        List<Car> cars1 = cars.stream().filter(car -> car.getModel().equals(modelToFind)).toList();
        double c = 0d;
        for (int i = 0; i < cars1.size(); i++) {
            c += cars1.get(i).getCost();
        }
        System.out.print("Средняя стоимость модели " + modelToFind + ": " + c/cars1.size());

    }
}
/*

a123me|Mercedes|White|0|8300000
b873of|Volga|Black|0|673000
w487mn|Lexus|Grey|76000|900000
p987hj|Volga|Red|610|704340
c987ss|Toyota|White|254000|761000
o983op|Toyota|Black|698000|740000
p146op|BMW|White|271000|850000
u893ii|Toyota|Purple|210900|440000
l097df|Toyota|Black|108000|780000
y876wd|Toyota|Black|160000|1000000
END
 */