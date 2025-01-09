package homeworks.homework02;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите степень в градусах Фаренгейта: ");
        int f = sc.nextInt();
        int c = (f-32)*5/9;
        System.out.printf("%d градусов по Фаренгейту равно %d по Цельсию", f, c);
    }
}
