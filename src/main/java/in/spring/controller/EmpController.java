package in.spring.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.spring.DTO.EmployeeSalaryDto;
import in.spring.DTO.EmployeeSalarySaveOrUpdateDto;
import in.spring.entity.Employee;
import in.spring.service.EmpService;

@RestController
	//@RestController
public class EmpController {

	@Autowired
	private EmpService service;

	@GetMapping("/get")
	public ResponseEntity<List<EmployeeSalaryDto>> getEmps() {

		List<Map<String, Object>> allEmps = service.getAllEmployeeAndSalaryDetails();

		return new ResponseEntity(allEmps, HttpStatus.OK);
	}

	@GetMapping("/get/{value}")
	public ResponseEntity<List<Employee>> getEmps(@PathVariable("value") Double salary) {

		List<Employee> emps = service.getEmps(salary);

		return new ResponseEntity(emps, HttpStatus.OK);
	}

	@PostMapping("/saveEmps")
	public ResponseEntity<String> saveEmp(@RequestBody EmployeeSalarySaveOrUpdateDto empDto) {

		String saveEmps = service.saveEmps(empDto);

		return new ResponseEntity(saveEmps, HttpStatus.CREATED);
	}

	@PutMapping("/updateEmps")
	public ResponseEntity<String> updateEmp(@RequestBody EmployeeSalarySaveOrUpdateDto empDto) {

		String saveEmps = service.updateEmps(empDto);

		return new ResponseEntity(saveEmps, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteEmp(@PathVariable Integer id) {

		String deleteEmp = service.deleteEmp(id);

		return new ResponseEntity(deleteEmp, HttpStatus.OK);
	}
}
