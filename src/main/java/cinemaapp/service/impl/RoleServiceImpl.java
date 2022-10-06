package cinemaapp.service.impl;

import cinemaapp.dao.RoleDao;
import cinemaapp.model.Role;
import cinemaapp.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role add(Role role) {
        return roleDao.add(role);
    }

    @Override
    public Role getByName(Role roleName) {
        return roleDao.getByName(roleName.getRoleName());
    }
}
