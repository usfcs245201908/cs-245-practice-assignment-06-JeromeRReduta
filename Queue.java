
public interface Queue<T> {
	
	public T dequeue(); // added Exception in case someone dequeues while stack empty;
	public void enqueue(T item);
	public boolean empty();

}
