import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
public class LinkedListt{
        public static void main(String args[]){
        LinkedList<Integer> lis = new LinkedList<>();
        lis.add(10);
        lis.addFirst(20);
        lis.addLast(30);
        lis.contains(20);
        for(int i:lis){System.err.print(i+" ");}
        //lis.removeFirst()
       // lis.removeLast()
       //lis.remove();
       System.out.println(lis.get(0));
       System.out.println(lis.getLast());
       System.out.println(lis.getFirst());
       
       
       
       
      
    }
}