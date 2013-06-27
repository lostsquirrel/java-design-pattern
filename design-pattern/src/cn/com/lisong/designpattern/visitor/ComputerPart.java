package cn.com.lisong.designpattern.visitor;

public interface ComputerPart {
	void accept(ComputerPartVisitor computerPartVisitor);
}
