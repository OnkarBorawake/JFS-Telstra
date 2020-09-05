package tpack;

public class Main {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());
		
		ThreadClass1 tob1  = new ThreadClass1();
		Thread t1 = new Thread(tob1);
		t1.setName("Thread 1");
		t1.start();
		
		Thread t2 = new Thread(tob1);
		t2.setName("Thread 2");
		t2.start();
		
		ThreadClass2 t3 = new ThreadClass2();
		t3.setName("Thread 3");
		t3.start();
		
		ThreadClass2 t4 = new ThreadClass2();
		t4.setName("Thread 4");
		t4.start();
			
		
		
	}

}
