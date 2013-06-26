package cn.com.lisong.designpattern.iterator;

public class NameRepository<T> implements Container<T> {

	public T[] names = null;
	public void setNames(T[] names){
		this.names = names;
	}
	@Override
	public Iterator<T> getIterator() {
		return new NameIterator();
	}
	
	private class NameIterator implements Iterator<T> {
		int index;

		@Override
		public boolean hasNext() {
			if (index < names.length) {
				return true;
			}
			return false;
		}

		@Override
		public T next() {
			if (this.hasNext()) {
				return names[index++];
			}
			return null;
		}
		
	}

}
