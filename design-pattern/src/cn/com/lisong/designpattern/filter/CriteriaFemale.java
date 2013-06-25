package cn.com.lisong.designpattern.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {
	private List<Person> females = new ArrayList<Person>();
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		if (!persons.isEmpty()) {
			for (Person person : persons) {
				if ("female".equalsIgnoreCase(person.getGender())) {
					females.add(person);
				}
			}
		}
		return females;
	}
}
