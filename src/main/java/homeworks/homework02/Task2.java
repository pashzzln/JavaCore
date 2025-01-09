package homeworks.homework02;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = sc.nextInt();
        System.out.print("Введите второе число: ");
        int b = sc.nextInt();
        System.out.println("Сумма двух целых чисел: " + (a+b));
        System.out.println("Разница двух целых чисел: " + (a-b));
        System.out.println("Произведение из двух целых чисел: " + (a*b));
        double h = (a+b)/2;
        System.out.println("Среднее из двух целых чисел: " + h);
        System.out.println("Расстояние двух целых чисел: " + (a-b));
        if(a>b){
            System.out.println("Максимальное целое число: " + a);
            System.out.println("Минимальное целое число: " + b);
        }else{
            System.out.println("Максимальное целое число: " + b);
            System.out.println("Минимальное целое число: " + a);
        }
    }
}
