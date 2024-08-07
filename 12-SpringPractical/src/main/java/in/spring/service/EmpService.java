package in.spring.service;

import java.util.List;
import java.util.Map;

import in.spring.DTO.EmployeeSalaryDto;
import in.spring.DTO.EmployeeSalarySaveOrUpdateDto;
import in.spring.entity.Employee;

public interface EmpService {

	List<Map<String, Object>> getAllEmployeeAndSalaryDetails();
	
	List<Employee> getEmps(Double salary);
	
	String saveEmps(EmployeeSalarySaveOrUpdateDto saveEmps);
	
	String updateEmps (EmployeeSalarySaveOrUpdateDto updateEmp);
	
	String deleteEmp(Integer id);
	
}
