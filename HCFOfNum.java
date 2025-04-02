import java.util.Scanner;

public class HCFOfNum {
    static int hcf(int a,int b){
        if(b==0) return a;
        return hcf(b,a%b);
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int a=inp.nextInt();
        int b=inp.nextInt();

        System.out.println("HCF of numbers :"+hcf(a,b));
    }
}
