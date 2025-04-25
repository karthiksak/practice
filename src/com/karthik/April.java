package com.karthik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class April {

	public static void main(String[] args) {

		String input = "Stream API Practice with Java";

		Map<Character, Long> tt = input.toUpperCase().chars().filter(Character::isLetter).mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		// Map<Character, Long> tt =
		// input.toLowerCase().chars().filter(Character::isLetter).mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));

		List<Employee> em = Arrays.asList(new Employee(0, "Ram", 0, "HR", input, 50000, input),
				new Employee(0, "Raj", 0, "HR", input, 60000, input),
				new Employee(0, "Ravi", 0, "IT", input, 75000, input),
				new Employee(0, "Ramesh", 0, "IT", input, 70000, input));

//		em.stream().collect(Collectors.groupingBy(e->e.getDepartNames(),Employee::getName));

		Map<String, List<Employee>> ttt = em.stream()
				.collect(Collectors.groupingBy(Employee::getDepartNames,
						Collectors.collectingAndThen(Collectors.toList(),
								l -> l.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
										.collect(Collectors.toList()))));

		List<Invoice> tttt = Arrays.asList(new Invoice("Alice", 200.00), new Invoice("Bob", 150.00),
				new Invoice("Alice", 300.00)		);
		
		
		Map<String ,Double> fff =  tttt.stream().collect(Collectors.groupingBy(e->e.getName(),
				Collectors.collectingAndThen(Collectors.toList(),l->l.stream().mapToDouble(Invoice::getSpent).sum())));
	
		List<String> ggg = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "date");
		
		List<String> ddd= ggg.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting())).entrySet().stream()
				.filter(t -> t.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
		
		
		List<Employee2> employees = Arrays.asList(
			    new Employee2("Alice", "HR", 50000),
			    new Employee2("Bob", "IT", 60000),
			    new Employee2("mob", "IT", 70000),
			    new Employee2("yob", "IT", 30000),
			    new Employee2("xob", "IT", 60000)
			);
		
		List<String> uuu = employees.stream().filter(e->e.getSalary()>50000).map(Employee2::getDepartNames).sorted().collect(Collectors.toList());
		
		       
		
		Map<Character, Long> jnjs = input.toLowerCase().chars().mapToObj(c->(char)c).filter(Character::isLetter).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		System.out.println(jnjs);
		
		
	}
}
