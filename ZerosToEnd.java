import java.util.Scanner;

public class ZerosToEnd {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=inp.nextInt();
        }

        int pos=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                pos=i;
                break;
            }
        }
        for(int i=pos+1;i<n;i++){
            if(arr[i] != 0){
                int t=arr[i];
                arr[i]=arr[pos];
                arr[pos]=t;
                pos++;
                while(arr[pos] != 0){
                    pos++;
                }
            }
            
        }
        for(int e:arr)
           System.out.print(e+" ");
    }
}
