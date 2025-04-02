import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        String str=inp.next();

        int count=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='X'){
                maxi=Math.max(maxi, count);
                count=0;
            }
            else{
                count++;
            }
        }
        maxi=Math.max(maxi, count);
        System.out.println(maxi);

    }
}
