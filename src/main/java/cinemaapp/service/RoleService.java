package cinemaapp.service;

import cinemaapp.model.Role;

public interface RoleService {
    Role add(Role role);

    Role getByName(Role roleName);
}
