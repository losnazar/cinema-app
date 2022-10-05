package cinemaapp.dao.impl;

import cinemaapp.dao.AbstractDao;
import cinemaapp.dao.TicketDao;
import cinemaapp.model.Ticket;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class TicketDaoImpl extends AbstractDao<Ticket> implements TicketDao {
    public TicketDaoImpl(SessionFactory factory) {
        super(factory, Ticket.class);
    }
}
