package homeworks.homework03.task1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
            TV AppleTV = new TV("Gray", "IOS", "Apple TV");
            TV DefaultTV = new TV();
            TV YaTV = new TV(50, 100, 100, "Silver", "YaOS X", "Yandex TV");
            TV LG = new TV(60);
            System.out.println(AppleTV.toString());
            System.out.println(DefaultTV.toString());
            System.out.println(YaTV.toString());
            System.out.println(LG.toString());
            System.out.println("");

            System.out.println("Цвет модели " + AppleTV.getModel() + " - " + AppleTV.getColour());
            System.out.println("Цвет модели " + DefaultTV.getModel() + " - " + DefaultTV.getColour());
            System.out.println("Цвет модели " + YaTV.getModel() + " - " + YaTV.getColour());
            System.out.println("Цвет модели " + LG.getModel() + " - " + LG.getColour());
            System.out.println("");

            AppleTV.setColour("Gold");
            DefaultTV.setDiagonal(50);
            LG.setBrightness(50);
            LG.setContrast(50);
            LG.setColour("White");
            System.out.println("");

            System.out.println(AppleTV.toString());
            System.out.println(DefaultTV.toString());
            System.out.println(YaTV.toString());
            System.out.println(LG.toString());
            System.out.println("");

            //Доп задание:

            Scanner sc = new Scanner(System.in);
            System.out.print("Введите цвет: ");
            String col = sc.nextLine();
            System.out.print("Введите Операционную систему: ");
            String os = sc.nextLine();
            System.out.print("Введите модель: ");
            String m = sc.nextLine();
            System.out.print("Введите диагональ: ");
            int d = sc.nextInt();
            System.out.print("Введите яркость: ");
            int b = sc.nextInt();
            System.out.print("Введите контрастность: ");
            int con = sc.nextInt();
            TV ScTV = new TV(d, b, con, col, os, m);
            System.out.println(ScTV.toString());
        }
    }

