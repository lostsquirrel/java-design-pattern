package cn.com.lisong.designpattern.singleton;

public class Singleton {
	private Singleton(){
		
	}
	private String message;
	private static Singleton instance = new Singleton();
	public static Singleton getInstance(String message) {
		instance.message = message;
		return instance;
		
	}
	public String showMessage() {
		return message + "  " + instance.hashCode();
	}
}
