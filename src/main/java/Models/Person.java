package Models;

import jakarta.persistence.*;

@Entity
@Table(name = "Persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int Id;
    public String Name;
    public int Age;
    public Person(){}
    public Person(String name, int age){
        this.Name=name;
        this.Age=age;
    }
}
