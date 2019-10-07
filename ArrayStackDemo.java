import java.util.*;

public class ArrayStackDemo {

    public static void main(String[] args) throws Exception {
        ArrayStack<String> a = new ArrayStack<>();

        for (int i = 0; i < 10; i++)
            a.push("a");



        System.out.println(Arrays.toString(a.getArray()));

        for (int i = 0; i < 10; i++)
            a.push("b");
        System.out.println(Arrays.toString(a.getArray()));


        for (int i = 0; i < 50; i++)
            System.out.println(a.pop());





    }
}
