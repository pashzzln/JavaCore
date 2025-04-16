package homeworks.homework12;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws ParseException, ValidationException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите данные: ");
        String[] data = sc.nextLine().split(" ");
        //проверка количества полей
        if (data.length<7){
            throw new ValidationException("Не хватает введенных аргументов");
        }else if (data.length>7){
            throw new ValidationException("Слишком много введенных аргументов");
        }

        //проверка фамилии
        if(!(data[0].matches("[а-яА-Яa-zA-Z]+"))){
            throw new ValidationException("Фамилия может содержать только буквы");
        }

        //проверка имени
        if(!(data[1].matches("[а-яА-Яa-zA-Z]+"))){
            throw new ValidationException("Имя может содержать только буквы");
        }

        //проверка отчества
        if(!(data[2].matches("[а-яА-Яa-zA-Z]+"))){
            throw new ValidationException("Отчество может содержать только буквы");
        }

        //проверка даты
        try {
            DateFormat d = new SimpleDateFormat("dd.MM.yyyy");
            String s = d.format(d.parse(data[3]));
        }catch (ParseException e){
            System.err.println("Дата должна иметь формат дд.мм.гггг " + e.getMessage());
        }
        if(!(data[3].matches("[0-9]+")) && !(data[3].contains("."))){
            throw new ValidationException("Дата должна содержать только цифры");
        }

        //проверка номера телефона
        if(!(data[4].matches("[0-9]+"))){
            throw new ValidationException("Номер телефона должен содержать только цифры");
        }else if(data[4].length()>11 || data[4].length()<11){
            throw new ValidationException("Номер телеофна должен состоять из 11 цифр");
        }

        Person p = new Person(data[0], data[1], data[2], data[3], Long.parseLong(data[4]), data[5].charAt(0), Integer.parseInt(data[6]));

    }
}

//Зеленов Павел Дмитриевич 11.07.2008 89086640561 m 16
