package cinemaapp.service;

import cinemaapp.model.MovieSession;
import cinemaapp.model.ShoppingCart;
import cinemaapp.model.User;

public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clear(ShoppingCart shoppingCart);
}
