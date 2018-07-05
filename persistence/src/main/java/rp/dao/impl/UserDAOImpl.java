package rp.dao.impl;

import org.springframework.stereotype.Repository;
import rp.dao.api.UserDAO;
import rp.models.User;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User("1", "Denys", "Verizhenko", "123", "11111111"));
        users.add(new User("2", "FirstName02", "LastName02", "123", "22222222"));
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }
}
