
 class MT extends Thread{
	 public MT(String na) {
		 super(na);
	 }
	@Override
	public void run() {
		System.out.println("I am new class : here's my name : " + Thread.currentThread().getName());
	}
	
	

}
public class TRunner {
	public static void main(String[] args) {
		MT m= new MT("AB");
		System.out.println("I am main class : " + Thread.currentThread().getName());
		m.start();
	}
}