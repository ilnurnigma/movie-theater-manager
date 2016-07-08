package my.manager;

import my.manager.console.ManagerConsole;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created on 7/1/2016.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ManagerConsole console = (ManagerConsole) context.getBean("managerConsole");

        console.start();
    }
}
