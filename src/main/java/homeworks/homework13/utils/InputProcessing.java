package homeworks.homework13.utils;

import java.text.ParseException;

public class InputProcessing {
    public static Integer parseCount(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Невалидное значение: ");
            e.getStackTrace();
        }
        return Integer.parseInt(str);
    }

    public static Integer validateCount(String str){
        try{
            parseCount(str);
        }catch(NumberFormatException e){
            e.getStackTrace();
        }
        return parseCount(str);
    }

    public static Integer parseNumber(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Невалидное значение: ");
            e.getStackTrace();
        }
        return Integer.parseInt(str);
    }

    public static Integer validateNumber(String str){
        try{
            parseNumber(str);
        }catch(NumberFormatException e){
            e.getStackTrace();
        }
        return parseCount(str);
    }

}

