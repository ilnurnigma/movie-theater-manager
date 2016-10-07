package my.manager.console;

import my.manager.dao.User;
import my.manager.service.UserService;

import java.util.List;
import java.util.Scanner;

/**
 * Created on 7/6/2016.
 */
public class ManagerConsole {
    private Scanner scanner = new Scanner(System.in);
    private UserService userService;

    public ManagerConsole(UserService userService) {
        this.userService = userService;
    }

    public void start() {
        System.out.println("Console started.");
        System.out.println("1 - get all users");
        System.out.println("2 - save user");
        System.out.println("0 - exit");
        String line;
        do {
            line = scanner.nextLine();

            switch (line) {
                case "1":
                case "get users":
                    List<User> all = userService.getAll();
                    System.out.println(all);
                    break;
                case "2":
                case "save":
                    saveUser();

                    break;

            }
        } while (!"0".equals(line) || !"exit".equals(line));


    }

    private void saveUser() {
        System.out.println("Enter user name");
        String name = scanner.nextLine();
        System.out.println("Enter user surname");
        String surname = scanner.nextLine();
        System.out.println("Enter user e-mail");
        String email = scanner.nextLine();
        new UserService().save(new User(123, name, surname, email));
    }
}
