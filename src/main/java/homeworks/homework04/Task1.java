package homeworks.homework04;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите букву: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        String letters = "qwertyuiopasdfghjklzxcvbnm";
        if(letters.indexOf(str) == 0) {
            System.out.println("Буква слева от вашей: " + letters.charAt(letters.length() - 1));
        } else{
            System.out.println("Буква слева от вашей: " + letters.charAt(letters.indexOf(str)-1));
        }
    }
}
