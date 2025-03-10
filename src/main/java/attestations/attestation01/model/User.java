package attestations.attestation01.model;

import attestations.attestation01.exceptions.ValidationException;

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

        String idCheck = elements[0].replaceAll("-", "");
        if(!(idCheck.matches("[a-zA-Z]+")) && !(idCheck.matches("[0-9]+")) && (idCheck.matches("[a-zA-Z0-9]*")) && (elements[0]!="")) this.id = elements[0];
        else if(elements[0]=="") throw new NullPointerException("ID не может быть пустым");
        else throw new ValidationException("ID должен состоять из букв и цифр");


        if(elements[1].isBlank()){
            this.creationTime = LocalDateTime.now();
        }else this.creationTime = LocalDateTime.parse(elements[1], DateTimeFormatter.ISO_LOCAL_DATE_TIME);

        if((elements[2].length()<=20) && (elements[2].replaceAll("_", "").matches("[a-zA-Z0-9]*")) && !(elements[2].matches("[0-9]+")) && (elements[2]!="")){
            this.login = elements[2];
        }else if(elements[2]=="") throw new NullPointerException("login не может быть пустым");
        else if(elements[2].length()>20) throw new ValidationException("Логин должен быть меньше 20 символов");
        else if (elements[2].matches("[0-9]+")) throw new ValidationException("Логин не должен состоять только из цифр");
        else if (!(elements[2].replaceAll("_", "").matches("[a-zA-Z0-9]*"))) throw new ValidationException("Логин должен содержать только цифры, буквы и нижнее подчеркивание");

        if ((elements[3].equals(elements[4])) && !(elements[3].matches("[a-zA-Z]+")) && (elements[3].replaceAll("_", "").matches("[a-zA-Z0-9]*")) && (elements[3].length()<=20) && (elements[3]!="")){
            this.password = elements[3];
            this.confirmPassword = elements[4];
        }
        else if (!(elements[3].equals(elements[4]))) throw new ValidationException("Пароли должны совпадать!");
        else if(elements[3]=="") throw new NullPointerException("пароль не может быть пустым");
        else if (elements[3].length()>20) throw new ValidationException("Пароль должен быть меньше 20 символов");
        else if (elements[3].matches("[a-zA-Z]+")) throw new ValidationException("Пароль не должен состоять только из букв!");
        else if (!(elements[3].replaceAll("_", "").matches("[a-zA-Z0-9]*"))) throw new ValidationException("Пароль должен состоять только из букв, цифр и нижнего подчеркивания!");

        if (elements[5].matches("[а-яА-Я]*") && elements[6].matches("[а-яА-Я]*")  && (elements[5]!="") && (elements[6]!="")){
            this.name = elements[6];
            this.surname = elements[5];
        }else if(elements[5]=="") throw new NullPointerException("Фамилия не может быть пустой");
        else if(elements[6]=="") throw new NullPointerException("Имя не может быть пустым");
        else if (!(elements[5].matches("[а-яА-Я]*"))) throw new ValidationException("Фамилия должна состоять только из букв!");
        else if (!(elements[6].matches("[а-яА-Я]*"))) throw new ValidationException("Имя должно состоять только из букв!");

        if (elements[7]==null || elements[7].matches("[а-яА-Я]*")) this.patronymic = elements[7];
        else if (!(elements[7].matches("[а-яА-Я]*"))) throw new ValidationException("Отчество должно состоять только из букв!");

        if(elements[8]!=null && (Integer.parseInt(elements[8])>=0)  && (elements[0]!="")) this.age = Integer.parseInt(elements[8]);
        else if(elements[8]==null || elements[8] == "") throw new NullPointerException("Возраст не может быть пустым");
        else if(Integer.parseInt(elements[8])<0) throw new ValidationException("Возраст может быть не меньше нуля");

        this.isWorker = Boolean.parseBoolean(elements[9]);
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
        return id+"|"+creationTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)+"|"+login+"|"+password+"|"+confirmPassword+"|"+surname+"|"+name+"|"+patronymic+"|"+age+"|"+isWorker;
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



