package attestations.attestation01.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class User {
    private String id;
    private LocalDateTime creationTime;
    private String login;
    private String password, confirmPassword;
    private String name, surname, patronymic;
    private int age;
    private boolean isWorker;

    //  f5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2|2023-12-25T19:10:11.556|noisemc_99|789ghs|789ghs|Крылов|Виктор|Павлович|25|true

    public User(String line){
        String[] elements = line.split("\\|");
        this.id = elements[0];

        if(elements[1].isBlank()){
            this.creationTime = LocalDateTime.now();
        }else this.creationTime = LocalDateTime.parse(elements[1], DateTimeFormatter.ISO_LOCAL_DATE_TIME);


    }



    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isWorker() {
        return isWorker;
    }

    public void setWorker(boolean worker) {
        isWorker = worker;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id+"|"+creationTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)+"|";
    }
}



/*Класс User
- id типа String
– гарантированно уникальный ID пользователя. Состоит избукв и цифр
-  дата   LocalDateTime   добавления   в   систему,   по   умолчанию   сегодня,формат: дата и время;
-  login   типа  String,  не   может   быть   только   из   цифр,   содержит   буквы,цифры, знак подчеркивания, меньше 20 символов
-  password и  confirmPassword типа  String, одинаковые,  не может  бытьтолько   из   букв,   содержит   буквы,   цифры,   знак   подчеркивания,  меньше   20символов
- фамилия - строка, состоит только из букв;
- имя - строка, состоит только из букв;
- отчество - строка, состоит только из букв, может отсутствовать;
- возраст – целое число, может отсутствовать;
- isWorker – является ли сотрудником предприятия, по умолчанию false.
 */



