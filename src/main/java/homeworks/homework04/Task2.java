package homeworks.homework04;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = sc.nextLine();
        String arrow1 = "<--<<";
        String arrow2 = ">>-->";
        int count1 = (str.length() - str.replace(arrow1, "").length())/arrow1.length();
        int count2 = (str.length() - str.replace(arrow2, "").length())/arrow2.length();
        System.out.println(count1 + count2);
    }
}
