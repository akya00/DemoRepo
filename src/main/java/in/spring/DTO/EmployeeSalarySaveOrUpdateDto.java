package in.spring.DTO;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

public class EmployeeSalarySaveOrUpdateDto {

	private Integer employeeId;
	private String employeeName;
	private String employeeAddress;
	private Date employeeJoiningDate;
	private Integer employeeSalId;
	private String employeeDepartment;
	private Double employeeSalary;
	@CreationTimestamp
	private Date createdOn;
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public Date getEmployeeJoiningDate() {
		return employeeJoiningDate;
	}
	public void setEmployeeJoiningDate(Date employeeJoiningDate) {
		this.employeeJoiningDate = employeeJoiningDate;
	}
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
		return "EmployeeSalarySaveOrUpdateDto [employeeId=" + employeeId + ", employeeName=" + employeeName
				+ ", employeeAddress=" + employeeAddress + ", employeeJoiningDate=" + employeeJoiningDate
				+ ", employeeSalId=" + employeeSalId + ", employeeDepartment=" + employeeDepartment
				+ ", employeeSalary=" + employeeSalary + ", createdOn=" + createdOn + "]";
	}
	public EmployeeSalarySaveOrUpdateDto(Integer employeeId, String employeeName, String employeeAddress,
			Date employeeJoiningDate, Integer employeeSalId, String employeeDepartment, Double employeeSalary,
			Date createdOn) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeeJoiningDate = employeeJoiningDate;
		this.employeeSalId = employeeSalId;
		this.employeeDepartment = employeeDepartment;
		this.employeeSalary = employeeSalary;
		this.createdOn = createdOn;
	}
	public EmployeeSalarySaveOrUpdateDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	}