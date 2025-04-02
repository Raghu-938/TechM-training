import java.util.*;
public class KadaneAlgo {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=inp.nextInt();
        }

        int maxi=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum > maxi){
                maxi=sum;
            }
            if(sum <0){
                sum=0;
            }
        }

        System.out.println(maxi);

    }
}
