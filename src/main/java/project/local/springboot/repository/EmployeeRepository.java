package project.local.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.local.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
