package rp.services.api;

import org.springframework.stereotype.Service;
import rp.models.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();
}
