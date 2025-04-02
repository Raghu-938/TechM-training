
import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        String str=inp.next();
        HashMap<Character,Integer> mp=new HashMap<>();
        

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            // if(mp.get(c)==null){
            //     mp.put(c, 1);
            // }
            // else{
            //     mp.put(c,mp.get(c)+1);
            // }
            mp.compute(c,(key,value)->(value==null) ? 1 : value+1);
          
        }

        System.out.println(mp);
        
    }
}
