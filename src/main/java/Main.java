import Models.Person;
import Servises.PersonServise;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PersonServise ps = new PersonServise();
        Scanner cons = new Scanner(System.in);
        while (true){
            try{
                System.out.print("\n\t\tManu\n\t1 = Show All\n\t2 = Add Person\n\t3 = Find By Id\n\t4 = Remuve By Id\n\t0 = Exit ");
                String menu = cons.nextLine();
                switch (menu){
                    case "1"-> {
                        System.out.println("\n\t\tAll Persons:");
                        List<Person> pl = ps.findAllPersons();
                        pl.forEach(x->System.out.println(x));
                    }
                    case "2"-> {
                        System.out.print("\nEnter Name: ");
                        String name = cons.nextLine();
                        System.out.print("Enter Age: ");
                        String age = cons.nextLine();
                        Person p = new Person(name,Integer.parseInt(age));
                        ps.savePerson(p);
                        System.out.println("\n\t\tAdded!");
                    }
                    case "3"->{
                        System.out.print("Enter Id: ");
                        String id = cons.nextLine();
                        System.out.println("\n\t\tYour Person:");
                        System.out.println(ps.findPerson(Integer.parseInt(id)));
                    }
                    case "4"->{
                        System.out.print("Enter Id: ");
                        String id = cons.nextLine();
                        ps.deletePerson(ps.findPerson(Integer.parseInt(id)));
                        System.out.println("\n\t\tRemuved!");
                    }
                    case "0" -> {return;}
                }
            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}