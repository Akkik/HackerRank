
 class MTRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Hello world ::" + Thread.currentThread().getName());
		
	}
	

}
public class RunnableRunner {
	public static void main(String[] args) {
		System.out.println("Main world ::" + Thread.currentThread().getName());
		Thread t = new Thread(new MTRunnable(),"AB");
		t.start();
	}
}