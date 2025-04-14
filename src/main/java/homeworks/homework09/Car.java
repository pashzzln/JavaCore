package homeworks.homework09;

import java.util.Objects;

public class Car {
    private String carBrand;
    private String model;
    private int releaseDate;
    private int power;
    private int boost;
    private int pendant;
    private int durability;

    public Car(){
        this.carBrand = "PORSCHE";
        this.model = "911";
        this.releaseDate = 2024;
        this.power = 580;
        this.boost = 100;
        this.pendant = 50;
        this.durability = 3;
    }

    public Car(String carBrand, String model, int releaseDate, int power, int boost, int pendant, int durability){
        this.carBrand = carBrand;
        this.model = model;
        this.releaseDate = releaseDate;
        this.power = power;
        this.boost = boost;
        this.pendant = pendant;
        this.durability = durability;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getBoost() {
        return boost;
    }

    public void setBoost(int boost) {
        this.boost = boost;
    }

    public int getPendant() {
        return pendant;
    }

    public void setPendant(int pendant) {
        this.pendant = pendant;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return releaseDate == car.releaseDate && power == car.power && boost == car.boost && pendant == car.pendant && durability == car.durability && Objects.equals(carBrand, car.carBrand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carBrand, model, releaseDate, power, boost, pendant, durability);
    }

    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", model='" + model + '\'' +
                ", releaseDate=" + releaseDate +
                ", power=" + power +
                ", boost=" + boost +
                ", pendant=" + pendant +
                ", durability=" + durability +
                '}';
    }
}
/*Базовый автомобиль обладает следующими свойствами:
маркой (строка),моделью (строка), годом выпуска (int), мощностью в лошадиных силах (int),ускорением (int), подвеской (int) и долговечностью (int).
Каждый отдельный тип автомобиля дополняет эти свойства.
Вот типы:
1. PerformanceCar – гоночный автомобиль.
Имеет дополнения addOns (массив строк, по умолчанию – пустой)
Увеличенная мощность двигателя на 50%.
Уменьшенная подвеска на 25%.
2. ShowCar – спортивная машина.
Включает поле stars (int). (по умолчанию – 0), поле для оценки популярности автомобиля.
 */