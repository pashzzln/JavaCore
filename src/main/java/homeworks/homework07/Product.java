package homeworks.homework07;

import java.util.Objects;

public class Product {
    private String name;
    private int cost;

    public Product(String name, int cost) {
        if(cost<=0){
            throw new IllegalArgumentException("Недопустимая стоимость продукта");
        }else this.cost = cost;
        if (name == null || name == "" || name == " " || name.length()<3){
            throw new IllegalArgumentException("Недопустимое имя продукта");
        } else {
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
        if (!(o instanceof homeworks.homework07.Product product)) return false;
        return cost == product.cost && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost);
    }

    @Override
    public String toString() {
        return "Product {" +
                "name = '" + name + '\'' +
                ", cost = " + cost +
                '}';
    }
}

/*
Ограничения в классах для продуктов:

Название продукта не должно содержать только цифры; ||
Если   название   продукта   короче,   чем   3   символа,   то   такое   название недействительно; ||
Если   стоимость   продукта   или   скидочного   продукта   0   или отрицательная, то такая цена неправильная. Должна быть ошибка валидации.  ||
*/
