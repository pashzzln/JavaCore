package model;

import attestations.attestation01.exceptions.ValidationException;
import attestations.attestation01.model.User;
import org.junit.jupiter.api.*;

public class UserTest {

    /*Класс User
   - id типа String
   – гарантированно уникальный ID пользователя. Состоит из букв и цифр
   -  дата   LocalDateTime   добавления   в   систему,   по   умолчанию   сегодня,формат: дата и время;
   -  login   типа  String,  не   может   быть   только   из   цифр,   содержит   буквы,цифры, знак подчеркивания, меньше 20 символов
   -  password и  confirmPassword типа  String, одинаковые,  не может  бытьтолько   из   букв,   содержит   буквы,   цифры,   знак   подчеркивания,  меньше   20символов
   - фамилия - строка, состоит только из букв;
   - имя - строка, состоит только из букв;
   - отчество - строка, состоит только из букв, может отсутствовать;
   - возраст – целое число, может отсутствовать;
   - isWorker – является ли сотрудником предприятия, по умолчанию false.
    */
    String id1, id2, id3, id4;
    String login1, login2, login3, login4;
    String password1, password2, password3, password4, confirmPassword;
    String name1, name2, name3, surname1, surname2, surname3, patronymic1, patronymic2, patronymic3;
    String age1, age2; //меньше нуля

    @BeforeEach
    public void setUp(){
        id1 = "fassffsb-acqe-bbre-acvf-cedggertuhhb||vityok_12|789ghs|789ghs|Крылов|Виктор|Павлович|45|false"; //только буквы
        id2 = "12344444-1234-4123-4124-123444444444||vityok_12|789ghs|789ghs|Крылов|Виктор|Павлович|45|false"; //только цифры
        id3 = "f5a823cb-4ac9-4b3b-8a65-c424@129b9d2||vityok_12|789ghs|789ghs|Крылов|Виктор|Павлович|45|false"; //спец символы
        id4 = "|2023-12-25T19:10:11.556|vityok_12|789ghs|789ghs|Крылов|Виктор|Павлович|45|false"; //null

        login1 = "f5a823cb-4ac9-4b3b-8a65-c424e129b9d2||12312323|789ghs|789ghs|Крылов|Виктор|Павлович|45|false"; //только цифры
        login2 = "f5a823cb-4ac9-4b3b-8a65-c424e129b9d2||123456789012345678901asdfasd|789ghs|789ghs|Крылов|Виктор|Павлович|45|false"; //больше 20 символов
        login3 = "f5a823cb-4ac9-4b3b-8a65-c424e129b9d2||@@@@@@@@@@@@|789ghs|789ghs|Крылов|Виктор|Павлович|45|false"; //спец символы
        login4 = "f5a823cb-4ac9-4b3b-8a65-c424e129b9d2|||789ghs|789ghs|Крылов|Виктор|Павлович|45|false"; //null

        password1 = "f5a823cb-4ac9-4b3b-8a65-c424e129b9d2||vityok_12|789ghs1234dsafsdf123rfadsfsd|789ghs1234dsafsdf123rfadsfsd|Крылов|Виктор|Павлович|45|false"; //больше 20 симв
        password2 = "f5a823cb-4ac9-4b3b-8a65-c424e129b9d2||vityok_12|asdfasdfas|asdfasdfas|Крылов|Виктор|Павлович|45|false"; //только буквы
        password3 = "f5a823cb-4ac9-4b3b-8a65-c424e129b9d2||vityok_12|@@@@|@@@@|Крылов|Виктор|Павлович|45|false"; //спец символы
        password4 = "f5a823cb-4ac9-4b3b-8a65-c424e129b9d2||vityok_12|||Крылов|Виктор|Павлович|45|false"; //null
        confirmPassword = "f5a823cb-4ac9-4b3b-8a65-c424e129b9d2||vityok_12|789ghs|123asdf|Крылов|Виктор|Павлович|45|false"; //разные пароли

        name1 = "f5a823cb-4ac9-4b3b-8a65-c424e129b9d2||vityok_12|789ghs|789ghs|Крылов|123|Павлович|45|false"; //цифры
        name2 = "f5a823cb-4ac9-4b3b-8a65-c424e129b9d2||vityok_12|789ghs|789ghs|Крылов|@@|Павлович|45|false"; //спец символы
        name3 = "f5a823cb-4ac9-4b3b-8a65-c424e129b9d2||vityok_12|789ghs|789ghs|Крылов||Павлович|45|false"; //null

        surname1 = "f5a823cb-4ac9-4b3b-8a65-c424e129b9d2||vityok_12|789ghs|789ghs|123|Виктор|Павлович|45|false"; //цифры
        surname2 = "f5a823cb-4ac9-4b3b-8a65-c424e129b9d2||vityok_12|789ghs|789ghs|@@|Виктор|Павлович|45|false"; //спец символы
        surname3 = "f5a823cb-4ac9-4b3b-8a65-c424e129b9d2||vityok_12|789ghs|789ghs||Виктор|Павлович|45|false"; //null

        patronymic1 = "f5a823cb-4ac9-4b3b-8a65-c424e129b9d2||vityok_12|789ghs|789ghs|Крылов|Виктор|123|45|false"; //цифры
        patronymic2 = "f5a823cb-4ac9-4b3b-8a65-c424e129b9d2||vityok_12|789ghs|789ghs|Крылов|Виктор|@@|45|false"; //спец символы

        age1 = "f5a823cb-4ac9-4b3b-8a65-c424e129b9d2||vityok_12|789ghs|789ghs|Крылов|Виктор|Павлович|-12|false"; //меньше 0
        age2 = "f5a823cb-4ac9-4b3b-8a65-c424e129b9d2||vityok_12|789ghs|789ghs|Крылов|Виктор|Павлович||false"; //NumberFormat
    }

    @AfterEach
    public void clear(){
        id1 = null;
        id2 = null;
        id3 = null;
        id4 = null;

        login1 = null;
        login2 = null;
        login3 = null;
        login4 = null;

        password1 = null;
        password2 = null;
        password3 = null;
        password4 = null;
        confirmPassword = null;

        name1 = null;
        name2 = null;
        name3 = null;

        surname1 = null;
        surname2 = null;
        surname3 = null;

        patronymic1 = null;
        patronymic2 = null;

        age1 = null;
        age2 = null;
    }

    @Test
    @DisplayName("ID test 1")
    void testID(){
        System.out.println("-------ID Test--------");
        System.out.println("Только буквы: ");
        Assertions.assertThrows(ValidationException.class, () -> new User(id1));
        System.out.println(Assertions.assertThrows(ValidationException.class, () -> new User(id1)).getMessage());
        System.out.println("Только цифры: ");
        Assertions.assertThrows(ValidationException.class, () -> new User(id2));
        System.out.println(Assertions.assertThrows(ValidationException.class, () -> new User(id2)).getMessage());
        System.out.println("Специальные символы: ");
        Assertions.assertThrows(ValidationException.class, () -> new User(id3));
        System.out.println(Assertions.assertThrows(ValidationException.class, () -> new User(id3)).getMessage());
        System.out.println("null: ");
        Assertions.assertThrows(NullPointerException.class, () -> new User(id4));
        System.out.println(Assertions.assertThrows(NullPointerException.class, () -> new User(id4)).getMessage());
        System.out.println("");
    }
    @Test
    @DisplayName("ID login 2")
    void testLogin(){
        System.out.println("-------Login Test--------");
        System.out.println("Только цифры: ");
        Assertions.assertThrows(ValidationException.class, () -> new User(login1));
        System.out.println(Assertions.assertThrows(ValidationException.class, () -> new User(login1)).getMessage());
        System.out.println("Больше 20 символов: ");
        Assertions.assertThrows(ValidationException.class, () -> new User(login2));
        System.out.println(Assertions.assertThrows(ValidationException.class, () -> new User(login2)).getMessage());
        System.out.println("Специальные символы: ");
        Assertions.assertThrows(ValidationException.class, () -> new User(login3));
        System.out.println(Assertions.assertThrows(ValidationException.class, () -> new User(login3)).getMessage());
        System.out.println("null: ");
        Assertions.assertThrows(NullPointerException.class, () -> new User(login4));
        System.out.println(Assertions.assertThrows(NullPointerException.class, () -> new User(login4)).getMessage());
        System.out.println("");
    }
    @Test
    @DisplayName("Password test 3")
    void testPassword(){
        System.out.println("-------Password Test--------");
        System.out.println("Больше 20 символов: ");
        Assertions.assertThrows(ValidationException.class, () -> new User(password1));
        System.out.println(Assertions.assertThrows(ValidationException.class, () -> new User(password1)).getMessage());
        System.out.println("Только буквы: ");
        Assertions.assertThrows(ValidationException.class, () -> new User(password2));
        System.out.println(Assertions.assertThrows(ValidationException.class, () -> new User(password2)).getMessage());
        System.out.println("Специальные символы: ");
        Assertions.assertThrows(ValidationException.class, () -> new User(password3));
        System.out.println(Assertions.assertThrows(ValidationException.class, () -> new User(password3)).getMessage());
        System.out.println("null: ");
        Assertions.assertThrows(NullPointerException.class, () -> new User(password4));
        System.out.println(Assertions.assertThrows(NullPointerException.class, () -> new User(password4)).getMessage());
        System.out.println("Разные пароли: ");
        Assertions.assertThrows(ValidationException.class, () -> new User(confirmPassword));
        System.out.println(Assertions.assertThrows(ValidationException.class, () -> new User(confirmPassword)).getMessage());
        System.out.println("");
    }
    @Test
    @DisplayName("Name test 4")
    void testName(){
        System.out.println("-------Name Test--------");
        System.out.println("Только цифры: ");
        Assertions.assertThrows(ValidationException.class, () -> new User(name1));
        System.out.println(Assertions.assertThrows(ValidationException.class, () -> new User(name1)).getMessage());
        System.out.println("Специальные символы: ");
        Assertions.assertThrows(ValidationException.class, () -> new User(name2));
        System.out.println(Assertions.assertThrows(ValidationException.class, () -> new User(name2)).getMessage());
        System.out.println("null: ");
        Assertions.assertThrows(NullPointerException.class, () -> new User(name3));
        System.out.println(Assertions.assertThrows(NullPointerException.class, () -> new User(name3)).getMessage());
        System.out.println("");
    }
    @Test
    @DisplayName("Surname test 5")
    void testSurname(){
        System.out.println("-------Surname Test--------");
        System.out.println("Только цифры: ");
        Assertions.assertThrows(ValidationException.class, () -> new User(surname1));
        System.out.println(Assertions.assertThrows(ValidationException.class, () -> new User(surname1)).getMessage());
        System.out.println("Специальные символы: ");
        Assertions.assertThrows(ValidationException.class, () -> new User(surname2));
        System.out.println(Assertions.assertThrows(ValidationException.class, () -> new User(surname2)).getMessage());
        System.out.println("null: ");
        Assertions.assertThrows(NullPointerException.class, () -> new User(surname3));
        System.out.println(Assertions.assertThrows(NullPointerException.class, () -> new User(surname3)).getMessage());
        System.out.println("");
    }
    @Test
    @DisplayName("Patronymic test 6")
    void testPatronymic(){
        System.out.println("-------Patronymic Test--------");
        System.out.println("Только цифры: ");
        Assertions.assertThrows(ValidationException.class, () -> new User(patronymic1));
        System.out.println(Assertions.assertThrows(ValidationException.class, () -> new User(patronymic1)).getMessage());
        System.out.println("Специальные символы: ");
        Assertions.assertThrows(ValidationException.class, () -> new User(patronymic2));
        System.out.println(Assertions.assertThrows(ValidationException.class, () -> new User(patronymic2)).getMessage());
        System.out.println("");
    }
    @Test
    @DisplayName("Age test 7")
    void testAge(){
        System.out.println("-------Age Test--------");
        System.out.println("Меньше нуля: ");
        Assertions.assertThrows(ValidationException.class, () -> new User(age1));
        System.out.println(Assertions.assertThrows(ValidationException.class, () -> new User(age1)).getMessage());
        System.out.println("NumberFormat: ");
        Assertions.assertThrows(NumberFormatException.class, () -> new User(age2));
        System.out.println(Assertions.assertThrows(NumberFormatException.class, () -> new User(age2)).getMessage());
    }

}