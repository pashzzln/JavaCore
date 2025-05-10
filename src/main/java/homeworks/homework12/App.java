package homeworks.homework12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws ParseException, ValidationException, IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите данные: ");
        String[] data = sc.nextLine().split(" ");
        //проверка количества полей
        if (data.length < 7) {
            throw new ValidationException("Не хватает введенных аргументов");
        } else if (data.length > 7) {
            throw new ValidationException("Слишком много введенных аргументов");
        }

        //проверка фамилии
        if (!(data[0].matches("[а-яА-Яa-zA-Z]+"))) {
            throw new ValidationException("Фамилия может содержать только буквы");
        }

        //проверка имени
        if (!(data[1].matches("[а-яА-Яa-zA-Z]+"))) {
            throw new ValidationException("Имя может содержать только буквы");
        }

        //проверка отчества
        if (!(data[2].matches("[а-яА-Яa-zA-Z]+"))) {
            throw new ValidationException("Отчество может содержать только буквы");
        }

        //проверка даты
        try {
            DateFormat d = new SimpleDateFormat("dd.MM.yyyy");
            String s = d.format(d.parse(data[3]));
        } catch (ParseException e) {
            System.err.println("Дата должна иметь формат дд.мм.гггг ");
        }
        if(data[3].contains(".")){
            String[] check =  data[3].split("\\.");
            if(!(check[0].matches("[0-9]+")) || !(check[1].matches("[0-9]+")) || !(check[2].matches("[0-9]+"))){
                throw new ValidationException("Дата должна содержать только цифры");
            }
        }


        //проверка номера телефона
        if (!(data[4].matches("[0-9]+"))) {
            throw new ValidationException("Номер телефона должен содержать только цифры");
        } else if (data[4].length() > 11 || data[4].length() < 11) {
            throw new ValidationException("Номер телеофна должен состоять из 11 цифр");
        }

        //проверка пола
        if (!(data[5].matches("[f]+|[m]+"))) {
            throw new ValidationException("Пол должен содержать одну букву: m - для мужчин, f - для женщин");
        }

        //проверка возраста
        if(!(data[6].matches("[0-9]+"))){
            throw new ValidationException("Возраст должен содержать только цифры");
        }else if (Integer.parseInt(data[6])<1){
            throw new ValidationException("Возраст должен быть больше 0");
        }
        Person p = new Person(data[0], data[1], data[2], data[3], Long.parseLong(data[4]), data[5].charAt(0), Integer.parseInt(data[6]));
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/java/homeworks/homework12/" + data[0]+".txt"))){
            bw.write(data[0] + " " + data[1] + " " + data[2] + " " + data[3] + " " + data[4] + " " + data[5] + " " + data[6]);
            bw.flush();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
}

    //Зеленов Павел Дмитриевич 11.07.2008 89086640561 m 16
