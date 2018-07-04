package rp.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rp.dao.api.UsersDAO;
import rp.models.User;
import rp.services.api.UsersService;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersDAO usersDAO;

    @Override
    public List<User> getUsers() {
        return usersDAO.getAllUsers();
    }
}
