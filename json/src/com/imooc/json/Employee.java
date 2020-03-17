package com.imooc.json;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Employee {
	private Integer empno;
	private String ename;
	private String job;
	@JSONField(name = "hiredate" , format="yyyy-MM-dd HH:mm:ss SSS")
	private Date hdate;
	private Float salary;
	@JSONField(serialize = false)
	private String dname;
	
	
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
	 * @return the hdate
	 */
	public Date getHdate() {
		return hdate;
	}
	/**
	 * @param hdate the hdate to set
	 */
	public void setHdate(Date hdate) {
		this.hdate = hdate;
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
	/**
	 * @return the dname
	 */
	public String getDname() {
		return dname;
	}
	/**
	 * @param dname the dname to set
	 */
	public void setDname(String dname) {
		this.dname = dname;
	}
	
}
