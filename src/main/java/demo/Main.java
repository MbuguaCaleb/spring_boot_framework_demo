package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //providing my bean factory through the application context
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Staff staff = context.getBean(Nurse.class);
        staff.assist();


    }
}
