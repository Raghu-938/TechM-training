import java.util.*;
public class PerfectNumber {

    static boolean isPerfect(int num){
        long ans=0;
        for(int i=num-1;i>=1;i--){
            if(num%i ==0){
                ans+=i;
            }
        }
        return ans==num;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int num=inp.nextInt();
        System.out.println((isPerfect(num)) ? "Perfect Number" : "not a perfect number");
        inp.close();
    }
}
