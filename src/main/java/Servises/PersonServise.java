package Servises;

import Dao.PersonDao;
import Models.Person;

import java.util.List;

public class PersonServise {
    private PersonDao personDao = new PersonDao();

    public PersonServise() {
    }

    public Person findPerson(int id) {
        return personDao.findById(id);
    }

    public void savePerson(Person user) {
        personDao.save(user);
    }

    public void deletePerson(Person person) {
        personDao.delete(person);
    }

    public void updatePerson(Person person) {
        personDao.update(person);
    }

    public List<Person> findAllPersons() {
        return personDao.findAll();
    }

//    public Auto findAutoById(int id) {
//        return usersDao.findAutoById(id);
//    }
}
