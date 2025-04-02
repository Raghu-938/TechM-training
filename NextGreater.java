import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=inp.nextInt();
        }

        int[] ans=new int[n];
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=1;i<n;i++) dq.addLast(arr[i]);

        for(int i=0;i<n;i++){
            int count=0;
            while(dq.size() != 0 && dq.getFirst() <= arr[i]){
                count++;
                dq.removeFirst();
            }
            if(dq.size() != 0)
                ans[i]=dq.getFirst();
            else{
                ans[i]=-1;
            }
            for(int j=i+count;j>i+1;j--){
                dq.addFirst(arr[j]);
            }
        }

        for(int e:ans){
            System.out.print(e+" ");
        }
    }
}
