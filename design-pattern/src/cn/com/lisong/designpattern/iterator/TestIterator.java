package cn.com.lisong.designpattern.iterator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestIterator {
	@Test
	public void testName() throws Exception {
		NameRepository<String> namesRepository = new NameRepository<String>();
		namesRepository.setNames(new String[]{"Robert" , "John" ,"Julie" , "Lora"});
		for (Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
			String name = (String) iter.next();
			System.out.println("Name : " + name);
		}
		
	}
}
