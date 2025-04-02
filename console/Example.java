package console;

import java.io.Console;


class Example{
    public static void main(String[] args) {
        Console con=System.console();
        if(con == null){
            System.out.println("No consle exist");
            return;
        }

        String name=con.readLine("Enter name: ");
        char[] password=con.readPassword("ENter password: ");
        con.format("Welcome , %s\n",name);
        con.printf("Password Length :%d ",password.length);
        for(char c:password){
            System.out.print(c);
        }
        
    }
}
