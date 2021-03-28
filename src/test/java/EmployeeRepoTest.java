import com.example.Employee;
import emRepo.EmployeeRepo;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class EmployeeRepoTest {

    @Test
    void findAllEmptyArray(){
        EmployeeRepo repo = new EmployeeRepo();
        assertThat(repo.findAll().isEmpty());
    }

    @Test
    void saveEmployeeRepo(){
        EmployeeRepo repo = new EmployeeRepo();
        repo.save(new Employee("1", 500));

        assertThat(repo.findAll()).isNotEmpty();
    }

    @Test
    void testIdOverwrites(){
        EmployeeRepo repo = new EmployeeRepo();
        repo.save(new Employee("1", 500));
        repo.save(new Employee("1", 500));

        assertThat(repo.findAll().size()).isEqualTo(1);
    }

    @Test
    void initializeWithEmployees(){
        List<Employee> initialList = new ArrayList<>();
        initialList.add(new Employee("1", 500));
        initialList.add(new Employee("2", 1000));
        EmployeeRepo repoWithStartValues = new EmployeeRepo(initialList);

        assertThat(repoWithStartValues.findAll()).containsAll(initialList);
    }
}
