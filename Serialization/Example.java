import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
    String name;
    int roll;
    Student(String name,int roll){
        this.name=name;
        this.roll=roll;
    }

    void dispaly(){
        System.out.println("Name: "+name+" , Roll :"+roll);
    }

}

class Example{
    public static void main(String[] args) throws IOException {
        Student s1=new Student("Nav", 1);
        FileOutputStream des=null;

        try{
            des=new FileOutputStream("Student.ser");
            ObjectOutputStream objStream=new ObjectOutputStream(des);
            objStream.writeObject(s1);
        }
        finally{
            des.close();
           
        }
    }
}