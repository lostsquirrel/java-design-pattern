package cn.com.lisong.designpattern.template;

public class Cricket extends Game {

	@Override
	public void initialize() {
		System.out.println("Cricket Game Initialized! Start playing.");
	}

	@Override
	public void startGame() {
		System.out.println("Cricket Game Started. Enjoy the game!");
	}

	@Override
	public void endGame() {
		System.out.println("Cricket Game Finished!");
	}

}
