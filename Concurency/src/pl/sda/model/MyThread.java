package pl.sda.model;
										//klasa do tworzenia nowych w�tk�w
public class MyThread extends Thread {
	
	@Override
	public void run() {
		
		System.out.println("wykona� si� w�tek" + getName());
		
	}

}
