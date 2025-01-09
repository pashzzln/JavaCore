package homeworks.homework02;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Исходная строка: ");
        String str = sc.nextLine();
        System.out.print("Сколько раз повторить? ");
        int c = sc.nextInt();
        for (int i = 0; i < c; i++) {
            System.out.print(str);
        }
    }
}
