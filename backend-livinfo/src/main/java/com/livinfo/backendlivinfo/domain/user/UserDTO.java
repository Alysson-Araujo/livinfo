package com.livinfo.backendlivinfo.domain.user;

import java.util.Date;

public record UserDTO(
        String username,
        String completeName,
        String email,
        String password,
        Date dateOfBirth,
        UserType userType
) {

}
