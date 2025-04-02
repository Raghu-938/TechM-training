import java.util.*;
public class ArrayDequeEx {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        dq.add(1);
        dq.offer(2);
        dq.addFirst(3);
        dq.addLast(5);
        System.out.println(dq);
        dq.remove();
        System.out.println(dq);
        dq.pollLast();
        dq.pollLast();

    }
}
