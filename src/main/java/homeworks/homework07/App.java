package homeworks.homework07;


import java.util.Scanner;

public class App {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String[] products0 = sc.nextLine().split("; ");
//        Product[] products = new Product[products0.length];
//        for (int i = 0; i < products0.length; i++) {
//            String[] nameCost = products0[i].split(" = ");
//            String[] costDisc = nameCost[1].split(", ");;
//            if (costDisc.length != 1){
//                costDisc[1] = costDisc[1].substring(0, costDisc[1].length()-1);
//                products[i] = new DiscountProduct(nameCost[0], Integer.parseInt(costDisc[0]), Integer.parseInt(costDisc[1]));
//            } else products[i] = new Product(nameCost[0], Integer.parseInt(nameCost[1]));
//        }
        // ввод через одну строку (назв продукта = цена; назв продукта = цена, скидка)

//        for (int i = 0; i < products.length; i++) {
//            if (products[i] instanceof DiscountProduct){
//                System.out.println("Name - " + products[i].getName() + ", Cost - " + products[i].getCost() + ", Discount - " + ((DiscountProduct) products[i]).getDiscount() + "%");
//            }else System.out.println("Name - " + products[i].getName() + ", Cost - " + products[i].getCost());
//
//        }
//        Проверка наполняемости

        Scanner sc = new Scanner(System.in);
        String end = sc.nextLine();
        String[] nameCost;
        String[] costDisc;
        Product[] products = new Product[100];
        int a = 0;
        while (!(end.equals(("END")))){
            nameCost = end.split(" = ");
            costDisc = nameCost[1].split(", ");
            if (costDisc.length != 1){
                costDisc[1] = costDisc[1].substring(0, costDisc[1].length()-1);
                products[a] = new DiscountProduct(nameCost[0], Integer.parseInt(costDisc[0]), Integer.parseInt(costDisc[1]));
                a++;
            }else{
                products[a] = new Product(nameCost[0], Integer.parseInt(nameCost[1]));
                a++;
            }
            end = sc.nextLine();
        }

//        for (int i = 0; i < products.length; i++) {
//            if(products[i]!= null){
//                System.out.println(products[i]);
//            }
//        }
        // Проверка ввода

        int c0 = 0;
        int c = 0;
        System.out.print("Обычные продукты: ");
        for (int j = 0; j < products.length; j++) {
            if(products[j] != null && !(products[j] instanceof DiscountProduct)) c0++;
        }
        for (int i = 0; i < products.length; i++) {
            if(products[i] != null){
                if(!(products[i] instanceof DiscountProduct)){
                    c++;
                    System.out.print(products[i].getName());
                    if(c<c0){
                        System.out.print(", ");
                    }
                }
            }
        }

        c0 = 0;
        c = 0;
        System.out.println("");
        System.out.print("Скидочные продукты: ");
        for (int j = 0; j < products.length; j++) {
            if(products[j] != null && products[j] instanceof DiscountProduct) c0++;
        }
        for (int i = 0; i < products.length; i++) {
            if(products[i] != null){
                if(products[i] instanceof DiscountProduct){
                    c++;
                    System.out.print(products[i].getName());
                    if(c<c0){
                        System.out.print(", ");
                    }
                }
            }
        }

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


