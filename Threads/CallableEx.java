import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableEx {
    public static void main(String[] args)  throws ExecutionException,InterruptedException{
        ExecutorService ex=Executors.newSingleThreadExecutor();
        Callable<Integer> task=()->{
            Thread.sleep(3000);
            return 10*10;
        };

        Future<Integer> future=ex.submit(task);
        int res=future.get();
        System.out.println(res);
        ex.shutdown();
    }
}
