// implement multithreading
public class Q9 {
    	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread 1");
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread 2");
			}
		}).start();
	}
}
