package com.imooc.employee;

public class Employee {
	private Integer empno;
	private String ename;
	private String department;
	private String job;
	private Float salary;
	
	
	public Employee(Integer empno, String ename, String department, String job, Float salary) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.department = department;
		this.job = job;
		this.salary = salary;
	}
	/**
	 * @return the empno
	 */
	public Integer getEmpno() {
		return empno;
	}
	/**
	 * @param empno the empno to set
	 */
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	/**
	 * @return the ename
	 */
	public String getEname() {
		return ename;
	}
	/**
	 * @param ename the ename to set
	 */
	public void setEname(String ename) {
		this.ename = ename;
	}
	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	/**
	 * @return the job
	 */
	public String getJob() {
		return job;
	}
	/**
	 * @param job the job to set
	 */
	public void setJob(String job) {
		this.job = job;
	}
	/**
	 * @return the salary
	 */
	public Float getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	
}
