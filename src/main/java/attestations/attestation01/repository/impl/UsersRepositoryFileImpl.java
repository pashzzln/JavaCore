package attestations.attestation01.repository.impl;

import attestations.attestation01.model.User;
import attestations.attestation01.repository.UsersRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class UsersRepositoryFileImpl implements UsersRepository {

    private static final List<User> USERS = new ArrayList<>();
    private static String FILE_PATH = "src/main/resources/input.txt";

    @Override
    public void create(User user) {

    }

    @Override
    public User findById(String id) {
        if(USERS.isEmpty()){
            findAll();
        }
        return USERS.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Пользователь не найден"));
    }

    @Override
    public List<User> findAll() {
        if(USERS.isEmpty()) {
            try(BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
                List<User> usersFromFile = br.lines()
                        .map(line -> new User(line))
                        .toList();
                USERS.addAll(usersFromFile);

                return USERS;
            } catch (IOException e) {
                System.out.println("Ошибка чтения файла - " + e.getMessage());
                return Collections.emptyList();
            }
        }
        return USERS;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void deleteById(String id) {

    }

    @Override
    public void deleteAll() {
        USERS.clear();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))){
            bw.write("");
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
