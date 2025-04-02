import java.util.*;
public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int num=inp.nextInt();
        boolean flag= false;
        for(int i=0;i<32;i++){
            if((1<<i) == num){
                System.out.println("Power of 2");
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println("Not a power of 2");
        }

        
    }
}
