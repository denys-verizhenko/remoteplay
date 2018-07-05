package rp.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rp.dao.api.UserDAO;
import rp.models.User;
import rp.services.api.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDAO userDAO;

    @Override
    public List<User> getUsers() {
        return userDAO.getAllUsers();
    }
}
