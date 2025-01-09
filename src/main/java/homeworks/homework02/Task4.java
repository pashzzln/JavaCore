package homeworks.homework02;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите повторяемый элемент сетки: ");
        String e = sc.nextLine();
        System.out.print("Введите число строк и столбцов сетки: ");
        int c = sc.nextInt();
        System.out.printf("Сетка по запросу %d на %d:", c, c);
        for (int i = 0; i < c; i++) {
            System.out.println("");
            for (int j = 0; j < c; j++) {
                System.out.print(e);
            }
        }
    }
}
