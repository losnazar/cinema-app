package cinemaapp.service;

import cinemaapp.model.Order;
import cinemaapp.model.ShoppingCart;
import cinemaapp.model.User;
import java.util.List;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
