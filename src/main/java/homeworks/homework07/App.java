package homeworks.homework07;


import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] products0 = sc.nextLine().split("; ");
        Product[] products = new Product[products0.length];
        for (int i = 0; i < products0.length; i++) {
            String[] nameCost = products0[i].split(" = ");
            String[] costDisc = nameCost[1].split(", ");;
            if (costDisc.length != 1){
                costDisc[1] = costDisc[1].substring(0, costDisc[1].length()-1);
                products[i] = new DiscountProduct(nameCost[0], Integer.parseInt(costDisc[0]), Integer.parseInt(costDisc[1]));
            } else products[i] = new Product(nameCost[0], Integer.parseInt(nameCost[1]));
        }

//        for (int i = 0; i < products.length; i++) {
//            if (products[i] instanceof DiscountProduct){
//                System.out.println("Name - " + products[i].getName() + ", Cost - " + products[i].getCost() + ", Discount - " + ((DiscountProduct) products[i]).getDiscount() + "%");
//            }else System.out.println("Name - " + products[i].getName() + ", Cost - " + products[i].getCost());
//
//        }
//        Проверка наполняемости
    }
}

/* Хлеб = 40
Молоко = 60
Торт = 800, 15%
Кофе растворимый = 432, 50%
END

888 = 78
END

ен = 78
END

Шоколадка = 0
END

Обычные продукты: Хлеб, Молоко
Акционные продукты:   Торт,   Коферастворимый
*/
