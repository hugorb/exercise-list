package services;

import java.util.ArrayList;
import java.util.List;

import model.Employee;

public class EmplyeeService {
	
	private List<Employee> employees = new ArrayList<>();
	
	public Employee findById(int id) {
		for (Employee employee : employees) {
			if(employee.getId().equals(id)) {
				return employee;
			}
		}
		return null;
	}
	
	public Employee salaryIncrease(int id, int percent) {
		Employee employee = findById(id);
		if(employee == null) {
			return null;
		}
		employees.remove(employee);
		double increase = (employee.getSalary() * percent)/100;
		employee.setSalary(employee.getSalary() + increase);
		employees.add(employee);
		return employee;
	}
	
	public List<Employee> findAll(){
		return employees;
	}
}
