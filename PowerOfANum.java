import java.util.*;
public class PowerOfANum {
    static int Power(int n,int base){
        if(base ==0) return 1;
        return n*Power(n,base-1);
    }

    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int base=inp.nextInt();

        System.out.println(Power(n,base));
    }
}
