package cn.com.lisong.designpattern.filter;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestFilter {

	@Test
	public void main() {
		
		
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Robert", "Male", "Single"));
		persons.add(new Person("John", "Male", "Married"));
		persons.add(new Person("Laura", "Female", "Married"));
		persons.add(new Person("Diana", "Female", "Single"));
		persons.add(new Person("Mike", "Male", "Single"));
		persons.add(new Person("Bobby", "Male", "Single"));
		Criteria male = new CriteriaMale();
		Criteria female = new CriteriaFemale();
		Criteria single = new CriteriaSingle();
		Criteria singleMale = new AndCriteria(new CriteriaSingle(), new CriteriaMale());
		Criteria singleOrFemale = new OrCriteria(new CriteriaSingle(), new CriteriaFemale());
		System.out.println("Males: " + persons.size());
		printPersons(male.meetCriteria(persons));
		System.out.println("\nFemales: " + persons.size());
		printPersons(female.meetCriteria(persons));
		System.out.println("\nSingle: " + persons.size());
		printPersons(single.meetCriteria(persons));
		System.out.println("\nSingle Males: " + persons.size());
		printPersons(singleMale.meetCriteria(persons));
		System.out.println("\nSingle Or Females: " + persons.size());
		printPersons(singleOrFemale.meetCriteria(persons));
	}

	public void printPersons(List<Person> persons) {
		System.out.println(persons.size());
		for (Person person : persons) {
			System.out.println("Person : [ Name : " + person.getName()
					+ ", Gender : " + person.getGender()
					+ ", Marital Status : " + person.getMaritalStatus() + " ]");
		}
	}
}
