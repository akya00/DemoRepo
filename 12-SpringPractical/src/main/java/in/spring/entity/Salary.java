package in.spring.entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Salary {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer employeeSalId;
	private String employeeDepartment;
	private Double employeeSalary;
	@CreationTimestamp
	private Date createdOn;
	
	public Integer getEmployeeSalId() {
		return employeeSalId;
	}
	public void setEmployeeSalId(Integer employeeSalId) {
		this.employeeSalId = employeeSalId;
	}
	public String getEmployeeDepartment() {
		return employeeDepartment;
	}
	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}
	public Double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(Double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	@Override
	public String toString() {
		return "Salary [employeeSalId=" + employeeSalId + ", employeeDepartment=" + employeeDepartment
				+ ", employeeSalary=" + employeeSalary + ", createdOn=" + createdOn + "]";
	}
	public Salary() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Salary(Integer employeeSalId, String employeeDepartment, Double employeeSalary, Date createdOn) {
		super();
		this.employeeSalId = employeeSalId;
		this.employeeDepartment = employeeDepartment;
		this.employeeSalary = employeeSalary;
		this.createdOn = createdOn;
	}
	
	
	

	
}
