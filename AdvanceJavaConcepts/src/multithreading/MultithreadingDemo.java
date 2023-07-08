package multithreading;

public class MultithreadingDemo implements Runnable {

	private Integer threadNumber;

	public MultithreadingDemo(Integer threadNumber) {
		super();
		this.threadNumber = threadNumber;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " from the the thread " + threadNumber);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}

	}

	public static void main(String[] args) {
	for (int i =1 ; i<= 5 ; i++) {
		MultithreadingDemo thread  =  new MultithreadingDemo(i) ; 
		Thread t = new Thread(thread) ; 
		t.start() ; 
	try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
		

	}}

//}
