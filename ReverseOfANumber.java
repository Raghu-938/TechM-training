import java.util.*;
public class ReverseOfANumber {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int num=inp.nextInt();
        System.out.println(Integer.parseInt(new String(new StringBuilder(Integer.toString(num)).reverse())));
        
        // int rev=0;
        // while(num>0){
        //     rev=rev*10 + (num%10);
        //     num/=10;
        // }
        // System.out.println(rev);


    }
}
