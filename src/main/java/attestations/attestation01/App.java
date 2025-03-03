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

        List<User> users = usersRepository.findAll();
        System.out.println(users);

        String s = "12341asdf";
        if(s.matches("^\\D*$")){
            System.out.println("В строке не должно быть цифр!");
        }

        String date = "";
        LocalDateTime time = LocalDateTime.parse(date, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }
}
