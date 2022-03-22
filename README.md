## Setting up the mysql database

- Install mysql community server on your pc. Login inside your mysql shell.
- mysql -u root -p
- Enter your password
- Create a new database by the name 'booknation' by using this command.
 ```
CREATE DATABASE booknation;
```

### Run the backend spring-boot server

- From the root folder of the application, follow these steps.
- Inside the application.properties, change the database username and password as per your mysql root user and password of your server
- Run the spring boot application, in the terminal by the command './mvnw clean spring-boot:run' that will create the necessary tables in the db.
- Create the `ROLE_USER` and `ROLE_ADMIN` in the already created roles tables in our database.
```
  INSERT INTO roles(name) VALUES('ROLE_USER');
  INSERT INTO roles(name) VALUES('ROLE_ADMIN');
```
### Creating an admin account for adding books
- From postman, create a post request on the server on the route "http://localhost:8080/api/auth/signup" with json request body.
- Example:
 ```
{
    "username": "admin",
    "email": "admin@mail.com",
    "password": "pass@123",
    "role": ["admin"]
}

```
- This creates an admin account for the application
### Add books in the database
- Go to "http://localhost:3000/signin" of client application, enter the admin username and password. It will be redirected to the admin page.
- Create a new book and submit.
