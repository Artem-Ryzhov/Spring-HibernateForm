package dao;

import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: артем
 * Date: 12.04.16
 * Time: 19:55
 * To change this template use File | Settings | File Templates.
 */
public interface Storage <T> {

    public Collection<T> getAllValues();
    public int addUser(T user);
    public void deleteAll();
    public void deleteUser(T user);
    public void editUser(T user);
    public T getUserById(int userid);
}
