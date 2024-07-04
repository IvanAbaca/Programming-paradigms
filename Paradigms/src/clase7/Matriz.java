package clase7;

public class Matriz<T> implements Iterable<T> {
	T[][] data;

	public T[][] getT() {
		return data;
	}

	public Matriz(T[][] data) {
		this.data = data;
	}

	public int getHeight() {
		return data.length;
	}
	
	public int getWitdh() {
		return data[0].length;
	}

	@Override
	public Iterator<T> createIterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
