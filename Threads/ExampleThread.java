class SharedResource{
    synchronized public void print(){
        try{
            for(int i=0;i<5;i++){
                System.out.println(Thread.currentThread().getName() + "_"+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        } 
        
    }
}

public class ExampleThread{
    public static void main(String[] args) throws InterruptedException{
        
            SharedResource r=new SharedResource();
            Thread t1=new Thread(r::print,"Thread1");
            Thread t2=new Thread(r::print,"Thread2");
            t1.start();
            t2.start();
        
        
        
    }
}