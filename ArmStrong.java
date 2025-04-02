import java.util.*;
public class ArmStrong {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int num=inp.nextInt();
        int temp=num;
        int noOfDig=String.valueOf(num).length();

        int ans=0;
        while(num >0){
            int rem=num%10;
            ans=(int) (ans+(Math.pow(rem,noOfDig)));
            num=num/10;
        }
        System.out.println((temp==ans) ? "Armstrong number" : "Not an armstrong");
        inp.close();
    }
}
