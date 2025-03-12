package homeworks.homework09;

import java.util.Arrays;

public class PerformanceCar extends Car{
    private String[] addOns;

    public PerformanceCar(){
        super();
        setPower(getPower()*3/2);
        setPendant(getPendant()/4*3);
    }

    public PerformanceCar(String carBrand, String model, int releaseDate, int power, int boost, int pendant, int durability){
        super(carBrand, model, releaseDate, power*3/2, boost, pendant/4*3, durability);
    }

    public String[] getAddOns() {
        return addOns;
    }

    public void setAddOns(String[] addOns) {
        this.addOns = addOns;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PerformanceCar that)) return false;
        if (!super.equals(o)) return false;
        return Arrays.equals(addOns, that.addOns);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(addOns);
        return result;
    }

    @Override
    public String toString() {
        return "PerformanceCar{" +
                "carBrand='" + getCarBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", releaseDate=" + getReleaseDate() +
                ", power=" + getPower() +
                ", boost=" + getBoost() +
                ", pendant=" + getPendant() +
                ", durability=" + getDurability() +
                "addOns=" + Arrays.toString(addOns) +
                '}';
    }
}
