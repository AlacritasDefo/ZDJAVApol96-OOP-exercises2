package pl.sda;

import pl.sda.zadanie1.Employee;
import pl.sda.zadanie1.Manager;
import pl.sda.zadanie1.Person;
import pl.sda.zadanie2.AdditionOperation;
import pl.sda.zadanie2.Operation;
import pl.sda.zadanie2.SubtractionOperation;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Person person1 = new Employee("informatyk", 2000);
        Person person2 = new Manager("IT", 3000);

        System.out.println(person1);
        System.out.println(person2);

        person1.setFirstName("Janek");
        person1.setLastName("Kobylka");

        person2.setFirstName("Pawel");
        person2.setLastName("Olejnik");

        System.out.println(person1);
        System.out.println(person2);
        Operation additionOperation = new AdditionOperation();
        Operation substractionOperation = new SubtractionOperation();

        System.out.println(additionOperation.calculate(2, 1));
        System.out.println(substractionOperation.calculate(5, 3));

    }
}
