package com.in28minutes.springboot.rest.webservices.restfulwebservices.service;

import com.in28minutes.springboot.rest.webservices.restfulwebservices.bean.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserDaoService {
    // JPA/Hibernate > Database
    // UserDaoService > Static List

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1,"Adam",LocalDate.now().minusYears(30)));
        users.add(new User(2,"Eve",LocalDate.now().minusYears(25)));
        users.add(new User(3,"Jim", LocalDate.now().minusYears(20)));
    }

    public List<User> findAll() {
        return users;
    }

    //public User save(User user) {

    //public User findOne(int id) {
}
