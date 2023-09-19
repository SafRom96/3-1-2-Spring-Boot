package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    List<User> listUsers();

    void update(User user);

    void remove(Long id);

    User findById(Long id);
}
