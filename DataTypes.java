import java.util.*;
public class DataTypes {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        byte b=s.nextByte();

        short sh=s.nextShort();
        int i=s.nextInt();
        long l=s.nextLong();
        float f=s.nextFloat();
        double d=s.nextDouble();
        char c=s.next().charAt(0);
        boolean bool=s.nextBoolean();

        System.out.println("byte :"+b);
        System.out.println("short :"+sh);
        System.out.println("integer :"+i);
        System.out.println("long :"+l);
        System.out.println("float :"+f);
        System.out.println("double :"+d);
        System.out.println("char :"+c);
        System.out.println("boolean :"+bool);


    }
}
