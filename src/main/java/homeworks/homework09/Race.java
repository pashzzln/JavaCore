package homeworks.homework09;

import java.util.ArrayList;
import java.util.Objects;

public class Race {
    private int length;
    private String route;
    private int prize;
    private ArrayList<Car> participants;

    public Race(){
        this.length = 500;
        this.route = "Paris, France";
        this.prize = 1000000000;
    }

    public Race(int length, String route, int prize, ArrayList<Car> cars){
        this.length = length;
        this.route = route;
        this.prize = prize;
        this.participants = cars;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public ArrayList<Car> getParticipants() {
        return participants;
    }

    public void setParticipants(ArrayList<Car> participants) {
        this.participants = participants;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Race race)) return false;
        return length == race.length && prize == race.prize && Objects.equals(route, race.route) && Objects.equals(participants, race.participants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, route, prize, participants);
    }

    @Override
    public String toString() {
        return "Race{" +
                "length=" + length +
                ", route='" + route + '\'' +
                ", prize=" + prize +
                ", participants=" + participants +
                '}';
    }
}

/* Гонка   имеет   следующие   свойства:
 длина   (int),   маршрут   (строка),призовой     фонд    (int)     и     участники     (коллекция     автомобилей),
 • CasualRace – обычная гонка.
 • DragRace – гонка за самый мощный двигатель.
 Идеальное переключениепередач — залог победы.
 • DriftRace – дрифтовая гонка */