package homeworks.homework03.task1;

import java.util.Objects;

public class TV {
    private String model;
    private Integer diagonal;
    private Integer brightness;
    private Integer contrast;
    private String operatingSystem;
    private String colour;
    private String col;

    public TV(int diagonal){
        this(diagonal, 10, 10, "Black", "Xiaomi OS", "Xiaomi TV");
    }
    public TV(String colour, String operatingSystem, String model) {
        this(75, 10, 10, colour, operatingSystem, model);
    }

    public TV(int diagonal, int brightness, int contrast, String colour, String operatingSystem, String model){
        this.brightness = brightness;
        this.contrast = contrast;
        this.colour = colour;
        this.operatingSystem = operatingSystem;
        this.diagonal = diagonal;
        this.model = model;
    }

    public TV(){
        this.brightness = 10;
        this.contrast = 10;
        this.colour = "Black";
        this.operatingSystem = "Xiaomi OS";
        this.diagonal = 75;
        this.model = "Xiaomi TV";
    }


    public Integer getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(Integer diagonal) {
        this.diagonal = diagonal;
    }

    public Integer getBrightness() {
        return brightness;
    }

    public void setBrightness(Integer brightness) {
        this.brightness = brightness;
    }

    public Integer getContrast() {
        return contrast;
    }

    public void setContrast(Integer contrast) {
        this.contrast = contrast;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }


    @Override
    public String toString() {
        return "TV{" +
                "diagonal = " + diagonal +
                ", brightness = " + brightness +
                ", contrast = " + contrast +
                ", operatingSystem = '" + operatingSystem + '\'' +
                ", colour = '" + colour + '\'' +
                ", model = '" + model + '\'' +
                '}';
    }
}
