package in.spring.DTO;

import java.util.Date;

public class EmployeeSalaryDto {
	
	private Integer employeeId;
	private String employeeName;
	private String employeeAddress;
	private Date empJoiningDate;
	private String empDepartment;
	private Double empSalary;
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
	public Date getEmpJoiningDate() {
		return empJoiningDate;
	}
	public void setEmpJoiningDate(Date empJoiningDate) {
		this.empJoiningDate = empJoiningDate;
	}
	public String getEmpDepartment() {
		return empDepartment;
	}
	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}
	public Double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	@Override
	public String toString() {
		return "EmployeeSalaryDto [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAddress="
				+ employeeAddress + ", empJoiningDate=" + empJoiningDate + ", empDepartment=" + empDepartment
				+ ", empSalary=" + empSalary + ", createdOn=" + createdOn + "]";
	}
	public EmployeeSalaryDto(Integer employeeId, String employeeName, String employeeAddress, Date empJoiningDate,
			String empDepartment, Double empSalary, Date createdOn) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.empJoiningDate = empJoiningDate;
		this.empDepartment = empDepartment;
		this.empSalary = empSalary;
		this.createdOn = createdOn;
	}
	public EmployeeSalaryDto() {
		super();
		// TODO Auto-generated constructor stub
	}

}
