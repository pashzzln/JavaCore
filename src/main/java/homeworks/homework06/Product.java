package homeworks.homework06;

import java.util.Objects;

public class Product {
    private String name;
    private int cost;

    public Product(String name, int cost) {
        if(cost<0){
            throw new IllegalArgumentException("Стоимость не может быть отрицательной");
        }else this.cost = cost;
        if (name == null || name == "" || name == " "){
            throw new IllegalArgumentException("Название продукта не может быть пустой строкой");
        }else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return cost == product.cost && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
