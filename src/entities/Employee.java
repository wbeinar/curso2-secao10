package entities;

import java.util.Objects;

public class Employee {
	
	private double id;
	private String name;
	private double salary;
	
	public Employee() {
		
	}
	
	public Employee(double id, String nome, double salario) {
		this.id = id;
		this.name = nome;
		this.salary = salario;
	}


	public double getId() {
		return id;
	}


	public void setId(double id) {
		this.id = id;
	}


	public String getNome() {
		return name;
	}


	public void setNome(String nome) {
		this.name = nome;
	}


	public double getSalario() {
		return salary;
	}


	public void setSalario(double salario) {
		this.salary = salario;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	public double improveSalary(int	percent) {
		return salary *= (percent/100 + 1);
		
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Double.doubleToLongBits(id) == Double.doubleToLongBits(other.id);
	}


	@Override
	public String toString() {
		return "Employee \n"
				+ "id=" + id 
				+ "\nnome=" + name 
				+ "\nsalario=" + salary;
	}
	
	
	
	

}
