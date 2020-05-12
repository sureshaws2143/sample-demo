package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping(path = "/")
	public List<Employee> printName()
	{

		Employee emp1 = new Employee();
		emp1.setName("Name1");
		emp1.setNumber(100);
		
		Employee emp2 = new Employee();
		emp2.setName("Name2");
		emp1.setNumber(200);
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		
		return empList;
		
		
	}
}
