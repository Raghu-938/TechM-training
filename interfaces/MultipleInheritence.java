interface  A{
    void show();
    
}
interface B {
    void show();
    
}
class C implements A,B{
     public void show(){
        System.out.println("conflict resolved");
    }
}


public class MultipleInheritence {
    public static void main(String[] args) {
        C ob=new C();
        ob.show();
    }
}
