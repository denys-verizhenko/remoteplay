package rp.dao.api;

import org.springframework.stereotype.Repository;
import rp.models.User;

import java.util.List;

public interface UsersDAO {

    List<User> getAllUsers();
}
