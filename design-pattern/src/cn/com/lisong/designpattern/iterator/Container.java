package cn.com.lisong.designpattern.iterator;

public interface Container<T> {
	Iterator<T> getIterator();
}
