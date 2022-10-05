package cinemaapp.dao.impl;

import cinemaapp.dao.AbstractDao;
import cinemaapp.dao.RoleDao;
import cinemaapp.exception.DataProcessingException;
import cinemaapp.model.Role;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl extends AbstractDao<Role> implements RoleDao {
    public RoleDaoImpl(SessionFactory factory) {
        super(factory, Role.class);
    }

    @Override
    public Role getByName(Role.RoleName roleName) {
        try (Session session = factory.openSession()) {
            Query<Role> query = session.createQuery("FROM Role r "
                    + "WHERE r.roleName =: roleName", Role.class);
            query.setParameter("roleName", roleName);
            return query.getSingleResult();
        } catch (Exception e) {
            throw new DataProcessingException("Can't get role by name: "
                    + roleName + " from DB", e);
        }
    }
}
