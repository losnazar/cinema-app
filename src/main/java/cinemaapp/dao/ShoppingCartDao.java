package cinemaapp.dao;

import cinemaapp.model.ShoppingCart;
import cinemaapp.model.User;

public interface ShoppingCartDao {
    ShoppingCart add(ShoppingCart shoppingCart);

    ShoppingCart getByUser(User user);

    ShoppingCart update(ShoppingCart shoppingCart);
}
