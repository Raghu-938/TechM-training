import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BusyBee {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=inp.nextInt();
        }
        int k=inp.nextInt();
        List<Integer[]> res=new ArrayList<>();
        Arrays.sort(arr);

        for(int i=0;i<n;i++){
            int j=i+1;
            while(j<n && arr[i]+arr[j] < 2*k){
                j++;
            }
            int count=n-j;
            for(int l=0;l<count;l++){
                Integer[] temp=new Integer[2];
                temp[0]=arr[i];
                temp[1]=arr[j++];
                res.add(temp);
            }
        }

        for(Integer[] a:res){
            System.out.println("("+a[0]+" , "+a[1]+")");
        }

    }
}
