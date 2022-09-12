package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    List<User> getAll();

    User getById(int id);

    void update(User user);

    void delete(int id);
}
