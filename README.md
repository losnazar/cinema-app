

# 🍿 [cinema-app](http://cinema-app-losyash.herokuapp.com/login) 🍿

Web aplication with webend part which implements work of the cinema-app 
using Java, Hibernate and Spring.
## Functionality
#### __ALL__
- __Registration and authorization__ `POST: /register` `GET: /login`
- __Logout__ `GET: /logout`
#### __ADMIN__  
- __Displaying__:
    - cinema halls `GET: /cinema-halls`
    - movies `GET: /movies`
    - available movie sessions `GET: /movie-sessions/available`
    - some specific movie session `GET: /movie-sessions/{id}` 
- __Adding:__ 
    - cinema halls `POST: /cinema-halls`
    - movies `POST: /movies`
    - movie sessions `POST: /movie-sessions`
- __Updating:__ 
    - movie session `PUT: /movie-sessions/{id}`
- __Deleting:__
    - movie session `DELETE: /movie-sessions/{id}` 
- __Getting:__ 
    - user by email `GET: /users/by-email`
#### __USER__
- __Displaying:__
    - cinema halls `GET: /cinema-halls`
    - movies `GET: /movies`
    - available movie sessions `GET: /movie-sessions/available`
    - some specific movie session `GET: /movie-sessions/{id}`
- __Getting:__
    - orders `GET: /orders`
    - shopping carts by user `GET: /shopping-carts/by-user`
- __Completing:__
    - orders `POST: /orders/complete`
- __Adding:__ 
    - tickets to shopping cart for some movie session `PUT: /shopping-carts/movie-sessions`
## Technologies
- Java 11
- Hibernate 
- Spring Core, Web MVC, ORM, Security
- REST
- AOP
- MySQL
- Apache Tomcat - version 9.0.50
## DB relations structure
![pic](cinema-app.png)
## Setup
- Clone project to your IDE.
- Create schema in MySQL.
- Add DB configurations in: 
    `src/main/resources/db.properties`.
- Test application with Postman using already created accounts:

ADMIN  
login: `admin@i.ua` password: `admin123`

USER  
login: `user@i.ua` password: `user123`

## Deployment
This project is deployed on [Heroku](http://cinema-app-losyash.herokuapp.com/login) cloud application platform and connected to JawsDB MySQL.

