import java.util.concurrent.CountDownLatch;

public class LatchEx {
    public static void main(String[] args) throws InterruptedException{
        CountDownLatch latch=new CountDownLatch(3);
        Runnable worker=()->{
            System.out.println(Thread.currentThread().getName()+"Worker Started");
            try{
                Thread.sleep(3000);
                latch.countDown();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        };
        for(int i=0;i<3;i++){
            new Thread(worker).start();
        }

        latch.await();
        System.out.println("all complted");
        

    }
}
