package homeworks.homework09;

public class App {
    public static void main(String[] args) {
        Car showcar = new ShowCar();
        System.out.println(showcar.toString());
    }
}

/*Каждый из представленных классов должен включать:
1. Конструктор пустой и с параметрами;
2. Переопределенный метод toString();
3. Геттеры и сеттеры для полей. Обратить внимание, что поля требуется сделать private;
4. У классов переопределены методы equals() и hashcode().
Работу с классами проверить в методе main класса App.*/