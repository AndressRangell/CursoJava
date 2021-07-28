package Connection;

import domain.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static Connection.MyConnection.close;
import static Connection.MyConnection.getConnection;

public class PersonDAO {

    private static final String SQL_SELECT = "SELECT id_person, name, surname, email, phone FROM person";
    private static final String SQL_INSERT = "INSERT INTO person(name, surname, email, phone) VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE person SET name = ?, surname = ?, email = ?, phone = ? WHERE id_person = ?";
    private static final String SQL_DELETE = "DELETE FROM person WHERE id_person = ?";

    public List<Person> select() {
        List<Person> people = new ArrayList<>();
        try {
            Connection cn = getConnection();
            PreparedStatement pst = cn.prepareStatement(SQL_SELECT);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                var idPerson = rs.getInt("id_person");
                var name = rs.getString("name");
                var surname = rs.getString("surname");
                var email = rs.getString("email");
                var phone = rs.getString("phone");
                Person person = new Person(idPerson, name, surname, email, phone);
                people.add(person);
            }
            close(cn, pst, rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return people;
    }

    public void insert(Person person){
        try {
            Connection cn = getConnection();
            PreparedStatement pst = cn.prepareStatement(SQL_INSERT);
            pst.setString(1, person.getName());
            pst.setString(2, person.getSurname());
            pst.setString(3, person.getEmail());
            pst.setString(4, person.getPhone());
            pst.executeUpdate();
            close(cn, pst);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Person person){
        try{
            Connection cn = getConnection();
            PreparedStatement pst = cn.prepareStatement(SQL_UPDATE);
            pst.setString(1, person.getName());
            pst.setString(2, person.getSurname());
            pst.setString(3, person.getEmail());
            pst.setString(4, person.getPhone());
            pst.setInt(5, person.getIdPerson());
            pst.executeUpdate();
            close(cn, pst);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void delete(Person person){
        try{
            Connection cn = getConnection();
            PreparedStatement pst = cn.prepareStatement(SQL_DELETE);
            pst.setInt(1, person.getIdPerson());
            pst.executeUpdate();
            close(cn, pst);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}
