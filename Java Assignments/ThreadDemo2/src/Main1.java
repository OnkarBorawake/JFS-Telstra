
public class Main1 {

	public static void main(String[] args) throws InterruptedException {

		System.out.println(Thread.currentThread().getName());
		
		ThreadClass1 tob1  = new ThreadClass1();
		Thread t1 = new Thread(tob1);
		t1.setName("Thread 1");
		
		t1.setPriority(Thread.MIN_PRIORITY);

		t1.start();
 
		Thread t2 = new Thread(tob1);
		t2.setName("Thread 2");
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		t1.join();
		
		Thread t3 = new Thread(tob1);
		t3.setName("Thread 3");
		t3.start();
		

		t2.yield();
		
		
	}

}
