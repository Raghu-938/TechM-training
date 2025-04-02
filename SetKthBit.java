import java.util.*;
public class SetKthBit {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int num=inp.nextInt();
        int k=inp.nextInt();

        num=num|(1<<k);
        System.out.println("New Number: "+num);
    }
}
