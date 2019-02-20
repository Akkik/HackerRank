import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

class MTExecutor implements Runnable{

	@Override
	public void run() {
		System.out.println("Hello world ::" + Thread.currentThread().getName());
		
	}
}

class CTExecutor implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		System.out.println("Hello world ::" + Thread.currentThread().getName());
		return IntStream.range(1, 10).sum();
	}
	
}
public class RunnableExecutor {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		
		
		Runnable run = () ->{
			System.out.println("Runnable java 8::" + Thread.currentThread().getName());
		};
		
		Callable<Integer> cal = ()->{
			System.out.println("Callable java 8::" + Thread.currentThread().getName());
			return 1;
		};
		
		System.out.println("Main world ::" + Thread.currentThread().getName());
		ExecutorService  service = Executors.newFixedThreadPool(1);
		//service.submit(new MTExecutor());
		//Future<Integer>  ret  = service.submit(new CTExecutor());
		service.submit(run);
		Future<Integer>  ret  = service.submit(cal);
		
		System.out.println(ret.get());
	}
}