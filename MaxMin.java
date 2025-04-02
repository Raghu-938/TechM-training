import java.util.*;
public class MaxMin {
    static int[] findMaxMin(int[] arr){
            int[] ans={Integer.MAX_VALUE,Integer.MIN_VALUE};
            
    
            for(int i=0;i<arr.length;i++){
                if(arr[i] < ans[0]) ans[0]=arr[i];
                if(arr[i] > ans[1]) ans[1]=arr[i];
            }
            return ans;
        }
        public static void main(String[] args){
            Scanner inp=new Scanner(System.in);
            int n=inp.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=inp.nextInt();
            }
            int[] ans=findMaxMin(arr);

        
        System.out.println("Max :"+ans[1]+" min :"+ans[0]);
    }
}
