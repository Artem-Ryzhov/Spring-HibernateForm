package model;

/**
 * Created by IntelliJ IDEA.
 * User: артем
 * Date: 12.04.16
 * Time: 20:07
 * To change this template use File | Settings | File Templates.
 */
public interface Worker {

    public int getId();
    public String getFirst_name();
    public String getLast_name();
    public int getSalary();
    public void setId(int id);
    public void setFirst_name(String first_name);
    public void  setLast_name(String last_name);
      public void  setSalary(int salary);
}
