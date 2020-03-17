package com.imooc.json;

import java.util.Calendar;

import com.alibaba.fastjson.JSON;

public class FastJsonSample1 {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmpno(4488);
		employee.setEname("������");
		employee.setJob("�ͻ�����");
		employee.setSalary(10000f);
		employee.setDname("�г���");
		Calendar c = Calendar.getInstance();
		c.set(2020, 2, 17, 0, 0,0);
		employee.setHdate(c.getTime());
		String json = JSON.toJSONString(employee);
		System.out.println(json);
		Employee emp = JSON.parseObject(json,Employee.class);
		System.out.println(emp.getDname());
	}

}
