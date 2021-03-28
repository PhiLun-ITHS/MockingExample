package emRepo;

import com.example.Employee;
import com.example.EmployeeRepository;
import java.util.ArrayList;
import java.util.List;


public class EmployeeRepo implements EmployeeRepository {
    private static List<Employee> employeeArray;

    public EmployeeRepo(){
        employeeArray = new ArrayList<>();
    }

    public EmployeeRepo(List<Employee> list){
        employeeArray = new ArrayList<>(list);
    }

    @Override
    public List<Employee> findAll() {
        return employeeArray;
    }

    @Override
    public Employee save(Employee e) {
        for (Employee em:employeeArray) {
            if (em.getId().equalsIgnoreCase(e.getId())){
                employeeArray.set(employeeArray.indexOf(em), e);
                return e;
            }
        }
        employeeArray.add(e);
        return e;
    }
}
