package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        userService.createUsersTable();
        userService.saveUser("John", "Doe", (byte) 25);
        userService.saveUser("Jane", "Doe", (byte) 30);
        userService.saveUser("Mike", "Smith", (byte) 35);
        userService.saveUser("Emily", "Johnson", (byte) 40);
        userService.removeUserById(2);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}