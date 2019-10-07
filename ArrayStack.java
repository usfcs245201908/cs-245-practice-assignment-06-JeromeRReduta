import java.util.*;

public class ArrayStack<T> implements Stack<T> {


    private T[] arr = (T[]) new Object[10];
    int tail = -1;

    public ArrayStack() {
    }

    public void push(T item) {
        if (tail == arr.length - 1)
            growArray();

        arr[++tail] = item;
    }

    public T pop() {

        return arr[tail--];
    }

    public T peek() {
        if (empty())
            return null;

        return arr[tail];
    }
    public boolean empty() {
        return tail == -1;
    }

    private void growArray() {
        arr = Arrays.copyOfRange(arr, 0, 2*arr.length);
    }

    public T[] getArray() { return arr; }

    public int getTail() {return tail;}

    public void setTail(int input) {tail = input;}


}
