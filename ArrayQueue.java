import java.util.Arrays;

public class ArrayQueue<T> implements Queue<T> {

    private T[] arr = (T[])new Object[10];

    public ArrayQueue() {
        arr[0] = null;
    }

    int head = 0;
    int tail = 0;

    public T dequeue() {

        T next = arr[++head];
        arr[head] = null;
        return next;
    }

    public void enqueue(T item) {
        if (tail == arr.length - 1)
            growArray();

        arr[++tail] = item;
    }
    public boolean empty() {
        return head == tail;
    }

    private void growArray() {
        arr = Arrays.copyOfRange(arr, 0, 2*arr.length);
    }


}
