package cinemaapp.dao;

import cinemaapp.model.Order;
import cinemaapp.model.User;
import java.util.List;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
