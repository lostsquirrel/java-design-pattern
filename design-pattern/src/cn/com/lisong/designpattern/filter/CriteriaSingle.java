package cn.com.lisong.designpattern.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {
	private List<Person> singles = new ArrayList<Person>();
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		if (!persons.isEmpty()) {
			for (Person person : persons) {
				if ("single".equalsIgnoreCase(person.getMaritalStatus())) {
					this.singles.add(person);
				}
			}
		}
		return this.singles;
	}
}
