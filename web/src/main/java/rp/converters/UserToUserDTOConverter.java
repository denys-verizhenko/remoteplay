package rp.converters;

import org.springframework.core.convert.converter.Converter;
import rp.dto.UserDTO;
import rp.models.User;

@rp.annotations.Converter
public class UserToUserDTOConverter implements Converter<User, UserDTO> {

    @Override
    public UserDTO convert(User user) {
        return new UserDTO(user.getId(), user.getFirstName(), user.getLastName(), user.getPhone());
    }
}
