package person.italy.agency;

import java.time.LocalDate;

public abstract class Person {
	
	String name;
	String surname;
	LocalDate dateOfBirth;
	String codeAgency;
	
	public Person(String name, String surname, LocalDate dateOfBirth, String codeAgency) {
		
		this.name = name;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.codeAgency = codeAgency;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getCodeAgency() {
		return codeAgency;
	}

	public void setCodeAgency(String codeAgency) {
		this.codeAgency = codeAgency;
	}
	
	public String getFullName() {
		return name + surname;
	}
	
	public abstract int getYearIncome();
	
	@Override
	public String toString() {
    	return "\nNome e cognome: " + getFullName()
    	+  "\nData di nascita: " + getDateOfBirth()
    	+ "\nCodice azienda: " + getCodeAgency();
    }
	
	
		
	

}
