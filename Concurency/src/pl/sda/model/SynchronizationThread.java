package pl.sda.model;

public class SynchronizationThread extends Thread {
	
	public static int counter = 1 ;
	
	private int name;
	
	public SynchronizationThread(int name){
		this.name = name;
	}
	
	@Override
	public void run() {
		
		
		synchronized (SynchronizationThread.class)
			{
				System.out.println("nazwa przed operacj¹: " + name + " Counter wynosi: " + counter);
			
			if (counter % 2 == 0) {
				counter--;
				System.out.println("nazwa po operacji zmniejszania: " + name + " Counter wynosi: " + counter);
			} else {
				counter++;
				System.out.println("nazwa po operacji zwiekszaniu: " + name + " Counter wynosi: " + counter);
			}
		
		}
	}

}
