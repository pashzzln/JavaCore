package homeworks.homework05Addition.task1;

import java.util.Scanner;

public class App {
    public static void main(String[] args){

//        Первое задание
//
//        TV AppleTV = new TV("Gray", "IOS", "Apple TV");
//        TV DefaultTV = new TV();
//        TV YaTV = new TV(50, 100, 100, "Silver", "YaOS X", "Yandex TV");
//        TV LG = new TV(60);
//        System.out.println(AppleTV.toString());
//        System.out.println(DefaultTV.toString());
//        System.out.println(YaTV.toString());
//        System.out.println(LG.toString());
//        System.out.println("");
//
//        System.out.println("Цвет модели " + AppleTV.getModel() + " - " + AppleTV.getColour());
//        System.out.println("Цвет модели " + DefaultTV.getModel() + " - " + DefaultTV.getColour());
//        System.out.println("Цвет модели " + YaTV.getModel() + " - " + YaTV.getColour());
//        System.out.println("Цвет модели " + LG.getModel() + " - " + LG.getColour());
//        System.out.println("");
//
//        AppleTV.setColour("Gold");
//        DefaultTV.setDiagonal(50);
//        LG.setBrightness(50);
//        LG.setContrast(50);
//        LG.setColour("White");
//        System.out.println("");
//
//        System.out.println(AppleTV.toString());
//        System.out.println(DefaultTV.toString());
//        System.out.println(YaTV.toString());
//        System.out.println(LG.toString());
//        System.out.println("");
//
//        //Доп задание:
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Введите цвет: ");
//        String col = sc.nextLine();
//        System.out.print("Введите Операционную систему: ");
//        String os = sc.nextLine();
//        System.out.print("Введите модель: ");
//        String m = sc.nextLine();
//        System.out.print("Введите диагональ: ");
//        int d = sc.nextInt();
//        System.out.print("Введите яркость: ");
//        int b = sc.nextInt();
//        System.out.print("Введите контрастность: ");
//        int con = sc.nextInt();
//        TV ScTV = new TV(d, b, con, col, os, m);
//        System.out.println(ScTV.toString());

        //Второе задание

        TV tv1 = new TV();
        tv1.setTvOn(true);
        tv1.setChannel(1); //первый канал
        tv1.setVolume(0);

        TV tv2 = new TV();
        tv2.setTvOn(true);
        tv2.setChannel(13); //стс
        tv2.setVolume(50);

        TV tv3 = new TV();
        tv3.setTvOn(false);
        tv3.setChannel(19); //тнт
        tv3.setVolume(10);

        TV tv4 = new TV();
        tv4.setTvOn(true);
        tv4.setChannel(2); //россия 1
        tv4.setVolume(15);

        TV tv5 = new TV();
        tv5.setTvOn(true);
        tv5.setChannel(57); //тнт HD
        tv5.setVolume(60);

        TV tv6 = new TV();
        tv6.setTvOn(false);
        tv6.setChannel(8); //карусель
        tv6.setVolume(35);

        TV tv7 = new TV();
        tv7.setTvOn(true);
        tv7.setChannel(16); //пятница
        tv7.setVolume(70);

        TV tv8 = new TV();
        tv8.setTvOn(false);
        tv8.setChannel(5); //пятый канал
        tv8.setVolume(55);

        TV tv9 = new TV();
        tv9.setTvOn(true);
        tv9.setChannel(20); //муз.тв
        tv9.setVolume(100);

        TV tv10 = new TV();
        tv10.setTvOn(false);
        tv10.setChannel(4); //нтв
        tv10.setVolume(52);

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите допустимое значение громкости: ");
        Integer maxVolume = sc.nextInt();

        TV[] tv = { tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9, tv10 };
        for (TV t : tv){
            if(t.isTvOn() == true){
                if(t.getVolume() <= maxVolume){
                    System.out.println(t.toString());
                }
            }else continue;
        }

        System.out.println("");

        for (int i = 0; i < tv.length; i++) {
            for (int j = 0; j < tv.length; j++) {
                if(tv[i].getChannel()<tv[j].getChannel()){
                    TV replace = tv[i];
                    tv[i] = tv[j];
                    tv[j] = replace;
                }else continue;
            }
        }
        for (TV t : tv) System.out.println(t.toString());

    }
}
