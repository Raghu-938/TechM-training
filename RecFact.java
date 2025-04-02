import java.util.Scanner;

public class RecFact {

    static long  fact(int n){
        if(n==0 || n==1) return 1;
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        System.out.println("Factorial:"+fact(n));
    }
}
