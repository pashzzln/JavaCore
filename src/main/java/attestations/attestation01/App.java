package attestations.attestation01;

import attestations.attestation01.model.User;
import attestations.attestation01.repository.UsersRepository;
import attestations.attestation01.repository.impl.UsersRepositoryFileImpl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class App {
    public static void main(String[] args) {
        UsersRepository usersRepository = new UsersRepositoryFileImpl();

        usersRepository.deleteAll(); //удаление всех элементов
        usersRepository.create(new User("f5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2|2023-12-25T19:10:11.556|noisemc_99|789ghs|789ghs|Крылов|Виктор|Павлович|25|true")); //добавление элемента
        usersRepository.create(new User("f5asdqcb-4ac9-4b3b-8a65-c4ppppf29b9d2|2023-12-25T19:10:11.556|pashzzln|AA12f|AA12f|Зеленов|Павел|Дмитриевич|16|false")); //добавление элемента
        usersRepository.create(new User("f5a8a3cb-aq13-4b3b-8a65-c424e12f9vfd2||oleggggg|asdf12|asdf12|Пупкин|Олег|Викторович|12|false")); //добавление элемента
        usersRepository.create(new User("afad12tf-4ac9-3121-8a65-c4245629b9d2||12qwerty|ghjk1|ghjk1|Васнецов|Дмитрий|Олегович|100|true")); //добавление элемента
        System.out.println(usersRepository.findAll());
        usersRepository.deleteById("f5asdqcb-4ac9-4b3b-8a65-c4ppppf29b9d2"); //удаление элемента
        System.out.println("");
        System.out.println(usersRepository.findAll()); //поиск всех элементов
        System.out.println("");
        System.out.println(usersRepository.findById("afad12tf-4ac9-3121-8a65-c4245629b9d2")); //поиск по айди элемента
        System.out.println("");
        usersRepository.update(new User("f5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2||vityok_12|789ghs|789ghs|Крылов|Виктор|Павлович|45|false")); //обновление информации об элементе
        System.out.println(usersRepository.findAll());
    }
}
