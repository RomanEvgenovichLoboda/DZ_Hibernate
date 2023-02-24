import Models.Person;
import Servises.PersonServise;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String menu;
        PersonServise ps = new PersonServise();
        Scanner cons = new Scanner(System.in);
        while (true){
            System.out.print("\n\t\tManu\n\t1 = Show All\n\t2 = Add Product\n\t0 = Exit ");
            menu = cons.nextLine();
            switch (menu){
                case "1"-> {
                   List<Person> pl = ps.findAllPersons();
                   pl.forEach(x->System.out.println(x.Name+" - "+x.Age));
                }
                case "2"-> {
                    System.out.print("\nEnter Name: ");
                    String name = cons.nextLine();
                    System.out.print("Enter Age: ");
                    int age = cons.nextInt();
                    Person p = new Person(name,age);
                    ps.savePerson(p);
                }
                case "0" -> {return;}
            }
        }






        //System.out.println("Hello world!");
        //PersonServise ps = new PersonServise();
        //Person p = new Person("Lena",30);
        //ps.saveUser(p);
    }
}