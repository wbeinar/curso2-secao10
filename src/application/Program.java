package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("How many employees wiil be registered? ");
		int qtd = sc.nextInt();
		
		for(int i = 1; i <= qtd; i++) {
			System.out.println("Employee #" + i + ":");
			System.out.print("Id: ");
			double id = sc.nextDouble();
			sc.next();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(new Employee(id, name, salary));
		}
		
		System.out.print("Enter the Employee id that will have salary increase: ");
		double increaseId = sc.nextDouble();
		System.out.print("Enter the percentage(10/100): ");
		int percent = sc.nextInt();
		
		//if(list.contains(increaseId));
		
		
		
		
		
		
		
		
		
		sc.close();


	}

}
