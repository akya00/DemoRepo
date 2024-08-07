package in.spring.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import in.spring.DTO.EmployeeSalaryDto;
import in.spring.DTO.EmployeeSalarySaveOrUpdateDto;
import in.spring.entity.Employee;
import in.spring.entity.Salary;
import in.spring.repository.EmployeeRepo;
import in.spring.repository.SalaryRepo;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmployeeRepo empRepo;
	
	@Autowired
	private JdbcTemplate template;

	@Autowired
	private SalaryRepo salrepo;

	@Override

	public List<Map<String, Object>> getAllEmployeeAndSalaryDetails()  {
		
		List<Map<String,Object>> queryForList = template.queryForList("call GetAllEmployeeAndSalaryDetails");		
		
		return queryForList;
	}

	@Override
	public List<Employee> getEmps(Double salary) {
		List<Employee> emps = empRepo.getEmps(salary);

		return emps;
	}

	@Override
	public String saveEmps(EmployeeSalarySaveOrUpdateDto saveEmps) {

		Employee emp = new Employee();

		emp.setEmployeeName(saveEmps.getEmployeeName());
		emp.setEmployeeAddress(saveEmps.getEmployeeAddress());
		emp.setEmployeeJoiningDate(new Date());

		empRepo.save(emp);

		Salary sal = new Salary();

		sal.setCreatedOn(new Date());
		sal.setEmployeeDepartment(saveEmps.getEmployeeDepartment());
		sal.setEmployeeSalary(saveEmps.getEmployeeSalary());

		salrepo.save(sal);
		return "record save success";
	}

	public String updateEmps(EmployeeSalarySaveOrUpdateDto updateEmp) {
		Integer employeeId = updateEmp.getEmployeeId();
		Integer employeeSalId = updateEmp.getEmployeeSalId();

		if (employeeId != null && employeeSalId != null) {
			Optional<Employee> empOpt = empRepo.findById(employeeId);
			Optional<Salary> salOpt = salrepo.findById(employeeSalId);

			if (empOpt.isPresent() && salOpt.isPresent()) {
				Employee emp = empOpt.get();
				Salary sal = salOpt.get();

				emp.setEmployeeName(updateEmp.getEmployeeName());
				emp.setEmployeeAddress(updateEmp.getEmployeeAddress());

				sal.setCreatedOn(new Date());
				sal.setEmployeeDepartment(updateEmp.getEmployeeDepartment());
				sal.setEmployeeSalary(updateEmp.getEmployeeSalary());

				empRepo.save(emp);
				salrepo.save(sal);

				return "Record update success";
			} else {
				return "No record found for the given IDs";
			}
		} else {
			return "Employee ID or Salary ID is null";
		}
	}

	@Override
	public String deleteEmp(Integer id) {

		if (id == null) {

			return "id is null";
		}

		if (empRepo.existsById(id) && salrepo.existsById(id)) {

			empRepo.deleteById(id);
			salrepo.deleteById(id);

			return "record deleted success";
		}

		return "record " + id + " not found";
	}

}
