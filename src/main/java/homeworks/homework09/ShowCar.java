package homeworks.homework09;

import java.util.Objects;

public class ShowCar extends Car{
    private int stars;

    public ShowCar(){
        super();
        this.stars = 0;
    }

    public ShowCar(String carBrand, String model, int releaseDate, int power, int boost, int pendant, int durability, int stars){
        super(carBrand, model, releaseDate, power, boost, pendant, durability);
        this.stars = stars;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShowCar showCar)) return false;
        if (!super.equals(o)) return false;
        return stars == showCar.stars;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), stars);
    }

    @Override
    public String toString() {
        return "ShowCar{" +
                "carBrand='" + getCarBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", releaseDate=" + getReleaseDate() +
                ", power=" + getPower() +
                ", boost=" + getBoost() +
                ", pendant=" + getPendant() +
                ", durability=" + getDurability() +
                ", stars=" + stars +
                '}';
    }
}
