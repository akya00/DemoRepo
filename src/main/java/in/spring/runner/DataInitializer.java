package in.spring.runner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

import in.spring.entity.Employee;
import in.spring.entity.Salary;
import in.spring.repository.EmployeeRepo;
import in.spring.repository.SalaryRepo;

@Configuration
public class DataInitializer implements ApplicationRunner {

	@Autowired
	private EmployeeRepo emprepos;
	
	@Autowired
	private SalaryRepo salrepos;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		
		Employee emp1 = new Employee(101, "akshay", "bhenda", new Date());
		Employee emp2 = new Employee(102, "pavan", "benglore", new Date());
		Employee emp3 = new Employee(103, "raj", "pune", new Date());
		Employee emp4 = new Employee(104, "pratap", "newwasa", new Date());
		Employee emp5 = new Employee(105, "nikhi;", "shirur", new Date());
		Employee emp6 = new Employee(106, "gajanan", "mumbai", new Date());
		
		List<Employee> asList = Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6);
		
		
		emprepos.saveAll(asList);
		
		
		salrepos.save(new Salary(101, "backend", 1727.34, new Date()));
		salrepos.save(new Salary(102, "frontend", 65743.34, new Date()));
		salrepos.save(new Salary(103, "devops", 34332.34, new Date()));
		salrepos.save(new Salary(104, "dba", 65756.34, new Date()));
		salrepos.save(new Salary(105, "sql", 4353.34, new Date()));
		salrepos.save(new Salary(106, "sales", 65753.34, new Date()));
		
	}

}
