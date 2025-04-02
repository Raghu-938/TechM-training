
class myThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(this.getName()+ "-count: "+i);
            try {
                Thread.sleep(1000);
            } 
            catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }
    }
}


class ThreadDemo{
    public static void main(String[] args) {
        myThread t1=new myThread();
        myThread t2=new myThread();
        myThread t3=new myThread();

        t1.start();
        t2.start();
        t3.start();
    }
}