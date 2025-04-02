import java.util.*;
public class BinarySearch {
    public static int binarySearch(int[] arr, int key){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(key < arr[mid]) r=mid-1;
            else l=mid+1;
        }
        return -1;
    }

    static int recursive(int[] arr,int key,int l,int r){
        if(l>r) return -1;

        int mid=(l+r)/2;
        if(arr[mid] == key) return mid;
        else if(key < arr[mid])
           return recursive(arr, key, l, mid-1);
        return recursive(arr, key, mid+1, r);
    }

    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=inp.nextInt();
        }

        int key=inp.nextInt();
        System.out.println((recursive(arr,key,0,arr.length-1)!=-1) ? "Key found" : "not found");
        System.out.println((binarySearch(arr,key)!=-1) ? "Key found" : "not found");
    }
}
