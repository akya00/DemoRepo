package in.spring.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import in.spring.DTO.EmployeeSalaryDto;
import in.spring.entity.Employee;
import in.spring.service.EmpService;
import jakarta.transaction.Transactional;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	
	
	//@Procedure(procedureName = "GetAllEmployeeAndSalaryDetails")
	@Query(value = "call GetAllEmployeeAndSalaryDetails",nativeQuery = true)
    List<Object[]> getAllEmployeeAndSalaryDetails();
    
    
  
    @Query(value = "SELECT * FROM Employee  JOIN Salary  ON employee_id = employee_sal_id WHERE employee_Salary >:salary",nativeQuery = true)
    List<Employee> getEmps(@Param("salary") Double salary);



    

	
	
}