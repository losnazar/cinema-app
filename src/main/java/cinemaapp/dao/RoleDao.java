package cinemaapp.dao;

import cinemaapp.model.Role;

public interface RoleDao {
    Role add(Role role);

    Role getByName(Role.RoleName roleName);
}
