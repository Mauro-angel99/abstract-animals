package person.italy.agency;

import java.time.LocalDate;

public class Employee extends Person {
	
	int salary;
	int monthlyCount;
	
	
	public Employee(String name, String surname, LocalDate dateOfBirth, String codeAgency, int salary, int monthlyCount) {
		
		super(name, surname, dateOfBirth, codeAgency);
		
		this.salary = salary;
		this.monthlyCount = monthlyCount;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int getMonthlyCount() {
		return monthlyCount;
	}


	public void setMonthlyCount(int monthlyCount) {
		this.monthlyCount = monthlyCount;
	}
	
	public int getYearIncome() {
		return salary * monthlyCount;
	}
	
	@Override
	public String toString() {
    	return super.toString()
    	+  "\nSalario: " + getSalary()
    	+ "\nMensilità: " + getMonthlyCount()
    	+ "\nGuadagno: " + getMonthlyCount();
    }
	
}
