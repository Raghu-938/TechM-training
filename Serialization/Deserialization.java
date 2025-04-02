import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) throws IOException , ClassNotFoundException{
        try{
            FileInputStream src=new FileInputStream("Student.ser");
            ObjectInputStream inpStream=new ObjectInputStream(src);
            Student s2=(Student) inpStream.readObject();
            s2.dispaly();

            src.close();
            inpStream.close();
        }
        finally{
            System.out.println("completed");
        }
    }
}
