package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //providing my bean factory through the application context
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Doctor staff = context.getBean(Doctor.class);
        staff.assist();
        System.out.println(staff.getQualification());

    }
}
