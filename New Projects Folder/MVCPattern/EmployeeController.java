public class EmployeeController {

    Employee employee;
    void setEmployeeName(Employee employee, String name){
        employee.setName(name);
    }
    String getEmployeeName(Employee employee){
        return employee.getName();
    }
    void setEmployeeNumber(Employee employee, Integer number){
        employee.setNumber(number);
    }
    String getEmployeeNumber(Employee employee){
        return employee.getNumber();
    }
    void setEmployeeJobTitle(Employee employee, String jobTitle){
        employee.setTitle(jobTitle);
    }
    String getEmployeeJobTitle(Employee employee){
        return employee.getTitle();
    }
    void setEmployeeSalary(Employee employee, Integer salary){
        employee.setSalary(salary);
    }
    long getEmployeeSalary(Employee employee){
        return employee.getSalary();
    }
}
