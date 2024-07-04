package clase7;

public class Array1D<T> implements Iterable<T> {
	T data[];
	
	public Array1D(T data[]) {
		this.data = data;
	}
	
	public T get(int pos)
	{
		return data[pos];
	}

	@Override
	public Iterator<T> createIterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
