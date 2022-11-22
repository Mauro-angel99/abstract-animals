package person.italy.agency;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		
		Employee employee  = new Employee("mauro", "Angelotti", LocalDate.now(), "422652563", 1200, 13);
		System.out.println(employee);
		
		System.out.println("--------------------------");
		
		Boss boss = new Boss("francesco", "Rossi", LocalDate.now(), "2365362", 5000, 2000);
		System.out.println(boss);
		
		System.out.println("--------------------------");
		
		Person[] persons = {employee, boss};
		
		int minYearIncone = Integer.MIN_VALUE;
		int maxYearIncone = Integer.MAX_VALUE;
		
		Person minYearInconePerson = null;
		Person maxYearInconePerson = null;
		
		for(int i=0; i<persons.length; i++) {
			
			Person person = persons[i];
			
			int yearIncome = person.getYearIncome();
			
			if(maxYearIncone > yearIncome) {
				
				minYearIncone = yearIncome;
				minYearInconePerson = person;
				
			}
			if(minYearIncone < yearIncome) {
				
				maxYearIncone = yearIncome;
				maxYearInconePerson = person;
			}
		}
		
		System.out.println("La persona con incasso annuale massimo è: " + maxYearInconePerson);
		System.out.println("--------------------------");
		System.out.println("La persona con incasso annuale minimo è: " + minYearInconePerson);
		System.out.println("--------------------------");
		System.out.println("L'incasso annuale massimo è: " + maxYearIncone);
		
		System.out.println("L'incasso annuale minimo è: " + minYearIncone);

}
	
}
