package homeworks.homework12;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Person {
    private String surname;
    private String name;
    private String patronymic;
    private String birthDate;
    private long number;
    private char sex;
    private int age;

    public Person(String surname, String name, String patronymic, String birthDate, long number, char sex, int age) throws ParseException {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        DateFormat d = new SimpleDateFormat("dd.MM.yyyy");
        this.birthDate = d.format(d.parse(birthDate));
        this.number = number;
        this.sex = sex;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname = '" + surname + '\'' +
                ", name = '" + name + '\'' +
                ", patronymic = '" + patronymic + '\'' +
                ", birthDate = '" + birthDate + '\'' +
                ", number = " + number +
                ", sex = " + sex +
                ", age = " + age +
                '}';
    }
}
