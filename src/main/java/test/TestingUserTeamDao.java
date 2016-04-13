package test;

import dao.Storage;
import model.Employee;
import model.Worker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: артем
 * Date: 11.04.16
 * Time: 20:35
 * To change this template use File | Settings | File Templates.
 */
public class TestingUserTeamDao {

    public static void main(String args[]){

        ApplicationContext context =
                new ClassPathXmlApplicationContext("Bean.xml");

        Storage store = (Storage) context.getBean("EmployeeStorage");

        ArrayList<Worker> list = (ArrayList<Worker>) store.getAllValues();

        for(int i = 0; i < list.size(); i++){
            Worker employee = list.get(i);
            System.out.println(employee.toString());
        }
        Worker employee1 = new Employee();
        Worker employee2 = new Employee();
        employee1.setLast_name("sano");
        employee1.setFirst_name("mars");
        employee1.setSalary(500);

        int id = store.addUser(employee1);
        int a = store.addUser(employee1);
        int b = store.addUser(employee1);
        System.out.println("+======================================================================+");
        employee2 = (Worker) store.getUserById(id);
        System.out.println(employee2.toString());
        //   store.deleteUser(employee2);
        //    store.deleteAll();
    }
}
