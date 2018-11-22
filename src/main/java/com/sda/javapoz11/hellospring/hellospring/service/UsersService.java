package com.sda.javapoz11.hellospring.hellospring.service;

import com.sda.javapoz11.hellospring.hellospring.entity.User;
import com.sda.javapoz11.hellospring.hellospring.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public User findById(long id) {
        return usersRepository.findById(id)
                .orElse(null);

    }
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        usersRepository.findAll()
                .forEach(e -> users.add(e));
        return users;
    }

    public List<User> findByLastName (String lastName) {
        return usersRepository.find
    }

    @PostConstruct
    private void init() {
        usersRepository.save(User.builder().firstName("Jan").lastName("Nowak").age(24).build());
        usersRepository.save(User.builder().firstName("Dorota").lastName("Suchalska").age(50).build());
        usersRepository.save(User.builder().firstName("Anna").lastName("Wisniewska").age(70).build());
        usersRepository.save(User.builder().firstName("Krzysztof").lastName("Nowak").age(3).build());

    }
}
