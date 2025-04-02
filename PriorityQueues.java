import java.util.*;
public class PriorityQueues {
    public static void main(String[] args) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        pq.offer(5);
        pq.offer(4);
        
        pq.offer(1);
        pq.offer(7);
        System.out.println(pq);
    }
}
