package Main;

import Connection.PersonDAO;
import domain.Person;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        PersonDAO personDAO = new PersonDAO();

        //Mostramos los registros de la base de datos
        /*List<Person> people = personDAO.select();
        people.forEach(System.out::println);*/

        //Insertamos una nueva persona a la base de datos
        /*Person person = new Person("Fabian", "Ardila", "fabian@gmail.com", "6345178");
        personDAO.insert(person);*/

        //Actualizamos algún campo de un registro
        /*Person person = new Person(5, "Fabian", "Lopez", "fabian@gmail.com", "6157474");
        personDAO.update(person);*/

        //Eliminamos un registro de la base de datos
        /*Person person = new Person(5);
        personDAO.delete(person);*/

    }

}
