package in.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.spring.entity.Salary;

public interface SalaryRepo extends JpaRepository<Salary, Integer> {

}
