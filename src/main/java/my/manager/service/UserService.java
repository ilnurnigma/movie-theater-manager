package my.manager.service;

import my.manager.dao.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 7/1/2016.
 */
public class UserService {
    private static List<User> userList = new ArrayList<>();

    static {
        userList.add(new User(123, "Vasily", "Pupkin", "vasya.pupkin@mail.ru"));
    }

    public void save(User user) {
        userList.add(user);
    }

    public void remove(User user) {
        userList.remove(user);
    }

    public User getById(Long id) {
        if (id == null) {
            return null;
        }

        for (User user : userList) {
            if (id.equals(user.getId())) {
                return user;
            }
        }

        return null;
    }

    public User getUserByEmail(String email) {
        if (email == null) {
            return null;
        }

        for (User user : userList) {
            if (email.equals(user.getEmail())) {
                return user;
            }
        }

        return null;
    }

    public List<User> getAll() {
        return userList;
    }
}
