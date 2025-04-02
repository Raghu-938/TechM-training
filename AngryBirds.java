import java.util.Arrays;
import java.util.Scanner;

public class AngryBirds {

    public static boolean isFeasible(int dis,int[] arr,int k){
        int start=arr[0];
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]-start >= dis){
                count++;
                start=arr[i];
            }
            if(count == k)
          return true;
        }

        
        return false;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=inp.nextInt();
        Arrays.sort(arr);
        int k=inp.nextInt();
        int l=1;
        int r=arr[n-1]-arr[0];
        int maxi=Integer.MIN_VALUE;
        while(l<=r){
            int mid=(l+r)/2;
            if(isFeasible(mid,arr,k)){
                maxi=mid;
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        System.out.println(maxi);
        
    }
}
