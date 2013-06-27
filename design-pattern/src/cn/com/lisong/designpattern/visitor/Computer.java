package cn.com.lisong.designpattern.visitor;


public class Computer implements ComputerPart {

	private ComputerPart[] parts;
	public Computer() {
		parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};  
	}
	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		for (ComputerPart computerPart : parts) {
			computerPart.accept(computerPartVisitor);
		}
		computerPartVisitor.visit(this);
	}

}
