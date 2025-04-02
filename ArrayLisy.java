import java.util.ArrayList;
import java.util.List;
public class ArrayLisy {
    public static void main(String[] args) {
        List<Integer> lis=new ArrayList<>();
        lis.add(5);
        lis.add(6);
        lis.remove(0);
        System.out.println(lis.get(0));
        System.out.println(lis.size());
        System.out.println(lis.contains(5));
        for(int e:lis)
        {
            System.out.println(e);
        }

    }
}
