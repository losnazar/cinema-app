package cinemaapp.dao.impl;

import cinemaapp.dao.AbstractDao;
import cinemaapp.dao.MovieDao;
import cinemaapp.model.Movie;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDaoImpl extends AbstractDao<Movie> implements MovieDao {
    public MovieDaoImpl(SessionFactory factory) {
        super(factory, Movie.class);
    }
}
