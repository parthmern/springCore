package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        System.out.println("-----------");
        Car car = context.getBean(Car.class);
        Car car2 = context.getBean(Car.class);
        System.out.println("-----------");
        PetrolEngine p1 = context.getBean(PetrolEngine.class);
        PetrolEngine p2 = context.getBean(PetrolEngine.class);
        car.drive();
    }
}
