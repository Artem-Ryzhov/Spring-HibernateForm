package controller;

import dao.Storage;
import model.Employee;
import model.Worker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by IntelliJ IDEA.
 * User: артем
 * Date: 11.04.16
 * Time: 21:18
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/admin")
public class Administrator {
    ApplicationContext context =
            new ClassPathXmlApplicationContext("Bean.xml");

    Storage store = (Storage) context.getBean("EmployeeStorage");

    @RequestMapping(value = "/listUser",method = RequestMethod.GET)
    public String showEmployee(ModelMap model) {
        model.addAttribute("employee",store.getAllValues());
        return "listUser";
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addEmployee(ModelMap model,Employee employee) {
        store.addUser(employee);
        return "redirect:/admin/listUser";
    }


    @RequestMapping(value = "/deleteEmployee",method = RequestMethod.GET)
    public String getById(ModelMap model,String id) {
        Worker employee  = (Worker) store.getUserById(Integer.parseInt(id));
        store.deleteUser(employee);
        return "redirect:/admin/listUser";
    }

    @RequestMapping(value = "/updateEmployeeid",method = RequestMethod.GET)
    public String getbyid(ModelMap model,String id) {
        Worker employee  = (Worker) store.getUserById(Integer.parseInt(id));
        model.addAttribute("employee",employee);
        return "updateEmp";
    }


    @RequestMapping(value = "/updateEmp",method = RequestMethod.POST)
    public String updateEmp(ModelMap model,Employee employee) {
        store.editUser(employee);
        return "redirect:/admin/listUser";
    }

    @RequestMapping(value = "/deleteAll",method = RequestMethod.GET)
    public String deleteAll() {
        store.deleteAll();
        return "redirect:/admin/listUser";
    }



}
