import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=inp.nextInt();
        }

        int key=inp.nextInt();
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(key == arr[i]){
                System.out.println("Key found at position "+i);
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println("Key not found");
        }
    }
}
