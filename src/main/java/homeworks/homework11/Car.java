package homeworks.homework11;

public class Car {
    private String plate;
    private String model;
    private String color;
    private int mileage;
    private int cost;
    public Car(String plate, String model, String color, int mileage, int cost){
        this.plate = plate;
        this.model = model;
        this.color = color;
        this.mileage = mileage;
        this.cost = cost;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "plate = '" + plate + '\'' +
                ", model = '" + model + '\'' +
                ", color = '" + color + '\'' +
                ", mileage = " + mileage +
                ", cost = " + cost +
                '}';
    }
}
