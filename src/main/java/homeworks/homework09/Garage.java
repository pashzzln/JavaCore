package homeworks.homework09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Garage {
    private Car[] parkedCars;

    public Garage(){
        this.parkedCars = new Car[10];
    }

    public Garage(int length){
        this.parkedCars = new Car[length];
    }

    public Car modify(Car car){
        car.setPower(car.getPower()*3/2);
        car.setPendant(car.getPendant()/4*3);
        return car;
    }

    public Car[] parkCar(Car car){
        for (int i = 0; i < this.parkedCars.length; i++) {
            if(this.parkedCars[i] == null) {
                this.parkedCars[i] = car;
                break;
            }
        }
        return this.parkedCars;
    }

    public Car[] getParkedCars() {
        return parkedCars;
    }

    public void setParkedCars(Car[] parkedCars) {
        this.parkedCars = parkedCars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Garage garage)) return false;
        return Arrays.equals(parkedCars, garage.parkedCars);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(parkedCars);
    }


    @Override
    public String toString() {
        List<Car> pc = new ArrayList<>();
        for (int i = 0; i < this.parkedCars.length; i++) {
            if (this.parkedCars[i]!=null){
                pc.add(this.parkedCars[i]);
            }
        }
        return "Garage{" +
                "parkedCars=" + pc.toString() +
                '}';
    }
}

/*Garage – место, где остаются все автомобили, когда они не участвуют в
гонках.   Гараж   также   предоставляет   возможность   модифицировать
припаркованный автомобиль. Включает parkedCars (массив объектов типа Car).*/