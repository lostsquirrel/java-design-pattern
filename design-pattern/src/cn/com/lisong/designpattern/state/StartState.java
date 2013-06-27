package cn.com.lisong.designpattern.state;

public class StartState implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("Start State .............");
		context.setState(this);
	}

	@Override
	public String toString() {
		return "Start State!";
	}
	

}
