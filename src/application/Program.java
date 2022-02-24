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

		for (int i = 1; i <= qtd; i++) {
			System.out.println("\nEmployee #" + i + ":");

			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.println("\nId already taken! Try again: ");
				id = sc.nextInt();
			}

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			list.add(new Employee(id, name, salary));
		}

		System.out.print("\nEnter the Employee id that will have salary increase: ");
		Integer increaseId = sc.nextInt();

		while (!hasId(list, increaseId)) {
			System.out.println("This Id does not exist! Try Again: \n");
			increaseId = sc.nextInt();
		}

		System.out.print("Enter the percentage(10/100): ");
		double percent = sc.nextDouble();

		for (Employee empp : list) {
			if (empp.getId() == increaseId) {
				empp.increaseSalary(percent);
			}
		}

		for (Employee emp2 : list) {
			System.out.println(emp2);
		}

		sc.close();

	}

	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
