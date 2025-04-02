import java.util.*;
public class controlStmts {
    public static void main(String[] args) {
        int x=5;
        if(x==5){
            System.out.println("If Result is : X is 5");
        }

        int age=18;
        System.out.println("If-else");
        if(age>=18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not eligible to vote");
        }

        System.out.println("Nested If:");
        if(x>0){
            if(x<100){
                System.out.println("X is in between 0-100");
            }
        }

        System.out.println("if-else if-else :");
        if(x>0){
            System.out.println("x is positive");
        }
        else if(x<0){
            System.out.println("X is negative");
        }
        else{
            System.out.println("X is zero");
        }

        System.out.println("Switch:");
        int a=10,b=5;

        char op='+';
        int res=0;
        switch(op){
            case '+': res=a+b;
                     break;
              
            case '-': res=a-b;
                      break;
            case '*': res=a*b;
                      break;
            default: res=a/b;
                     break;
              
        }
        System.out.println("result :"+ res);

        Scanner inp=new Scanner(System.in);
        // System.out.println("Enter day:");
        int day=inp.nextInt();
        switch(day){
            case 1: System.out.println("Sunday");
                    break;
            case 2: System.out.println("Monday");
                    break;
            case 3: System.out.println("Tuesday");
                    break;
            case 4: System.out.println("Wednesday");
                    break;
            case 5: System.out.println("Thursday");
                    break;
            case 6: System.out.println("Friday");
                    break;
            case 7: System.out.println("Saturday");
                    break;
            default: System.out.println("Invalid");
                     break;

        }

    }
}
