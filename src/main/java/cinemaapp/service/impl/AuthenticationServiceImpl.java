package cinemaapp.service.impl;

import cinemaapp.model.Role;
import cinemaapp.model.User;
import cinemaapp.service.AuthenticationService;
import cinemaapp.service.RoleService;
import cinemaapp.service.ShoppingCartService;
import cinemaapp.service.UserService;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private final UserService userService;
    private final ShoppingCartService shoppingCartService;
    private final RoleService roleService;

    public AuthenticationServiceImpl(UserService userService,
                                     ShoppingCartService shoppingCartService,
                                     RoleService roleService) {
        this.userService = userService;
        this.shoppingCartService = shoppingCartService;
        this.roleService = roleService;
    }

    @Override
    public User register(String email, String password) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        Role userRole = new Role();
        userRole.setRoleName(Role.RoleName.USER);
        user.setRoles(Set.of(roleService.getByName(userRole)));
        userService.add(user);
        shoppingCartService.registerNewShoppingCart(user);
        return user;
    }
}
