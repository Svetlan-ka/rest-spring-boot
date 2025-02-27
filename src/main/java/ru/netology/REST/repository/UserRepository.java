package ru.netology.REST.repository;

import org.springframework.stereotype.Repository;
import ru.netology.REST.model.Authorities;

import java.util.ArrayList;
import java.util.List;


@Repository
public class UserRepository {

    public List<Authorities> getUserAuthorities(String login, String password) {
        List<Authorities> adminAuthorities = new ArrayList<>(List.of(Authorities.READ, Authorities.WRITE, Authorities.DELETE));
        List<Authorities> userAuthorities = new ArrayList<>(List.of(Authorities.READ));

        if (login.equals("admin") && password.equals("admin"))
            return adminAuthorities;

        if (login.equals("user1") && password.equals("user1"))
            return userAuthorities;

        if (login.equals("user2") && password.equals("user2"))
            return userAuthorities;

        if (login.equals("user3") && password.equals("user3"))
            return userAuthorities;

        return null;
    }
}
