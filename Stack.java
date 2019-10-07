
public interface Stack<T> {
	
	public void push(T item);
	// Added exception in case stack pops while empty - Jerome
	public T pop();
	public T peek();
	public boolean empty();

}
