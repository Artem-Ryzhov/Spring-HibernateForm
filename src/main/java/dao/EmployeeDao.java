package dao;

import model.Worker;

import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: артем
 * Date: 12.04.16
 * Time: 19:58
 * To change this template use File | Settings | File Templates.
 */
public interface EmployeeDao extends Storage<Worker>{
    @Override
    Collection<Worker> getAllValues();

    @Override
    int addUser(Worker user);

    @Override
    void deleteAll();

    @Override
    void deleteUser(Worker user);

    @Override
    void editUser(Worker user);

    @Override
    Worker getUserById(int userid);
}
