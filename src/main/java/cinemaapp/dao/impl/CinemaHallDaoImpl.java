package cinemaapp.dao.impl;

import cinemaapp.dao.AbstractDao;
import cinemaapp.dao.CinemaHallDao;
import cinemaapp.model.CinemaHall;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class CinemaHallDaoImpl extends AbstractDao<CinemaHall> implements CinemaHallDao {
    public CinemaHallDaoImpl(SessionFactory factory) {
        super(factory, CinemaHall.class);
    }
}
