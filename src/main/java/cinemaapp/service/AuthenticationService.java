package cinemaapp.service;

import cinemaapp.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
