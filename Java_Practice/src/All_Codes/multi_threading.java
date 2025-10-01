package All_Codes;

public class multi_threading {

	public static void main(String[] args) {
		Thread t1 = new Thread(new thread1());
		t1.start();
		Thread t2 = new Thread(new thread2());
		t2.start();
		

	}

}
class thread1 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Running threda 1"+i);
		}
		
	}
	
}

class thread2 implements Runnable {
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Runiing 2nd threda" + i);
		}
	
}}