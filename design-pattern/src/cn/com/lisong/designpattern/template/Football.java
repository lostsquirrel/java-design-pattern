package cn.com.lisong.designpattern.template;

public class Football extends Game {

	@Override
	public void initialize() {
		System.out.println("Football Game Initialized! Start playing.");
	}

	@Override
	public void startGame() {
		System.out.println("Football Game Started. Enjoy the game!");
	}

	@Override
	public void endGame() {
		System.out.println("Football Game Finished!");
	}

}
