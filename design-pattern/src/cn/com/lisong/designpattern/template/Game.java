package cn.com.lisong.designpattern.template;

public abstract class Game {
	public abstract void initialize();
	public abstract void startGame();
	public abstract void endGame();
	
	public final void play() {
		this.initialize();
		this.startGame();
		this.endGame();
	}
}
