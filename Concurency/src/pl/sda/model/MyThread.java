package pl.sda.model;
										//klasa do tworzenia nowych w¹tków
public class MyThread extends Thread {
	
	@Override
	public void run() {
		
		System.out.println("wykona³ siê w¹tek" + getName());
		
	}

}
