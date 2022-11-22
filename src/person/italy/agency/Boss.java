package person.italy.agency;

import java.time.LocalDate;

public class Boss extends Person {
	
	int salary;
	int bonus;
	
	
	public Boss(String name, String surname, LocalDate dateOfBirth, String codeAgency, int salary, int bonus) {
		
		super(name, surname, dateOfBirth, codeAgency);
		
		this.salary = salary;
		this.bonus = bonus;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int getBonus() {
		return bonus;
	}


	public void setBonus(int bonsu) {
		this.bonus = bonsu;
	}
	
	public int getYearIncome() {
		return salary * 12 + bonus;
	}
	
	@Override
	public String toString() {
    	return super.toString()
    	+  "\nSalario: " + getSalary()
    	+ "\nBonus: " + getBonus()
    	+ "\nGuadagno annuo: " + getYearIncome();
    }
	

}
