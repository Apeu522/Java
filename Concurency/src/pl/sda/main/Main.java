package pl.sda.main;

import pl.sda.model.MyThread;
import pl.sda.model.MyThreadRunnable;
import pl.sda.model.SynchronizationThread;

public class Main {

	private static final SynchronizationThread[][] SynchronizationThread = null;

	public static void main(String[] args) throws InterruptedException {
//		MyThread m = new MyThread();
//		m.start();
//		m.getName();
//		
//		MyThread threads[] = new MyThread[10];
//		
//			for (int i = 0; i < threads.length; i++) {
//				threads[i] = new MyThread();
//				}
//			
//			for (MyThread myThread : threads) {
//				myThread.start(); // Start tworzy w¹tek
//				myThread.join();
//			}
		//======================================================================================================
//		Thread t = new Thread(new MyThreadRunnable(1));
//		t.start();
//		
//		MyThreadRunnable tab[] = new MyThreadRunnable[10];
//		
//	for (int i = 0; i < tab.length; i++) {
//		tab[i] = new MyThreadRunnable(i);
//	}
//	for (MyThreadRunnable myThreadRunnable : tab) {
//		Thread t1 = new Thread(myThreadRunnable);
//		t1.start();
//		t1.join();		//Uporz¹dkowuje odpalanie w¹tków od najmniejszego do najwiekszego.
//	}		
		
		SynchronizationThread tab2[] = new SynchronizationThread[100];
		
		for (int i = 0; i < tab2.length; i++) {
			tab2[i] = new SynchronizationThread(i);
			
		}
		
		for (SynchronizationThread synchronizationThread : tab2) {
			synchronizationThread.start();
		}
	}
}
