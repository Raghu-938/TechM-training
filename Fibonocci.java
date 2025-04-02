import java.util.Scanner;

public class Fibonocci {
    public static void main(String[] args) {
        int a=0,b=1;
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();

        // if(n==1){
        //     System.out.println(a);
        // }
        // else if(n==2){
        //     System.out.println(a);
        //     System.out.println(b);
        // }
        // else{
        //     System.out.println(a);
        //     System.out.println(b);
        //     for(int i=3;i<=n;i++){
        //         int c=a+b;
        //         System.out.println(c);
        //         a=b;
        //         b=c;
        //     }
          
        // }
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
