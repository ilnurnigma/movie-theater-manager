package my.manager;

import my.manager.console.ManagerConsole;
import my.manager.service.AuditoriumService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.Console;

/**
 * Created on 7/1/2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        AuditoriumService auditoriumService = (AuditoriumService) context.getBean("auditoriumService");


/*        Console console = System.console();
        if (console == null) {
            System.out.println("ManagerConsole object was not found.");
            return;
        }

        ManagerConsole managerConsoleHelper = new ManagerConsole(console);
        managerConsoleHelper.start();*/
    }
}
