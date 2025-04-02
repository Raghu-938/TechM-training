import java.util.*;
public class RotateArray {
    static void reverse(int[] arr,int st,int end){
        while(st<=end){
            //  arr[st]=(arr[st]^arr[end]);
            //  arr[end]=(arr[st]^arr[end]);
            //  arr[st]=(arr[st]^arr[end]);
            int t=arr[st];
            arr[st]=arr[end];
            arr[end]=t;
             st++;
             end--;

        }
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=inp.nextInt();
        }

        int k=inp.nextInt();
    //     int[] ans=new int[n];
    //     int index=0;
    //     for(int i=k;i<n;i++){
    //         ans[index++]=arr[i];
    //     }

    //     for(int i=0;i<k;i++){
    //         ans[index++]=arr[i];
    //     }
    //     for(int e:ans){
    //         System.out.print(e+" ");
    //     }
    // }
    reverse(arr,0,k-1);
    reverse(arr,k,n-1);
    reverse(arr,0,n-1);
    for(int e:arr){
        System.out.print(e+" ");
    }
    }
}
