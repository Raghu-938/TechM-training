import java.util.*;
public class KthBitCheck {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int num=inp.nextInt();
        int k=inp.nextInt();
        int res=k&(1<<k);
        if( (num&(1<<k)) != 0){
            System.out.println("Bit set");
        }
        
        else{
            System.out.println("bit is zero");
        }
    }
}
