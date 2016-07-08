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
        String line;
        do {
            line = scanner.nextLine();

            switch (line) {
                case "get users":
                    List<User> all = userService.getAll();
                    System.out.println(all);
            }
        } while (!"exit".equals(line));


    }
}
