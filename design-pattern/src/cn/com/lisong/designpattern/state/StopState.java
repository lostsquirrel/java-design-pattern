package cn.com.lisong.designpattern.state;

public class StopState implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("Stop State ..............");
		context.setState(this);
	}

	@Override
	public String toString() {
		return "Stop State!";
	}
	

}
