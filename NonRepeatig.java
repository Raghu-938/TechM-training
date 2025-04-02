import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class NonRepeatig {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=inp.nextInt();

        }
        HashSet<Integer> s=new HashSet<>(s);
        for(int e:arr){
            s.add(e);
        }

        for(int e:s){
            System.out.print(e+" ");
        }

    }
}
