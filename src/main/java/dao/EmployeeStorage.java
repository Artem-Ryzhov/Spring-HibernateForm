package dao;

import model.Employee;
import model.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;


@Repository
public class EmployeeStorage implements EmployeeDao{
    private HibernateTemplate hibernateTemplate;

    @Autowired
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate){
        this.hibernateTemplate = hibernateTemplate;
    }

    @Transactional
    public Collection<Worker> getAllValues() {
        return (Collection<Worker>) this.hibernateTemplate.find("From Employee");
    }

    @Transactional
    public int addUser(Worker employee) {
        this.hibernateTemplate.save(employee);
        return employee.getId();
    }

   @Transactional
    public void deleteAll() {
       List<Worker> results = (List<Worker>) hibernateTemplate.find("from Employee");
          for ( Worker i : results){
                hibernateTemplate.delete(i);
            }
    }

     @Transactional
    public void deleteUser(Worker employee) {
        this.hibernateTemplate.delete(employee);


    }

    @Transactional
    public void editUser(Worker employee) {
        this.hibernateTemplate.update(employee);
    }

    @Transactional
    public Worker getUserById(int userid) {
        Worker f = hibernateTemplate.get(Employee.class,userid);
        return f;
    }
}
