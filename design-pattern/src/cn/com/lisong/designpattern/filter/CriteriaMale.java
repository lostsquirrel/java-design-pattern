package cn.com.lisong.designpattern.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {
	private List<Person> males = new ArrayList<Person>();
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		if (!persons.isEmpty()) {
			for (Person person : persons) {
				if ("male".equalsIgnoreCase(person.getGender())) {
					males.add(person);
				}
			}
		}
		return males;
	}
}
