import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrimeMagi {
    public static boolean isPrime(int num){
        for(int i=2;i<num;i++){
            if(num%i == 0)
              return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        
        ArrayList<Integer> primes=new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                primes.add(i);
            }
        }
        Set<Integer> set=new HashSet<>(primes);
        int count=0;
        int sum=primes.get(0);
        for(int i=1;i<primes.size();i++){
            sum+=primes.get(i);
            if(set.contains(sum)){
                count++;
            }
        }

        System.out.println(count);
        
    }
}
