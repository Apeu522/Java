package pl.sda.model;
														//drugi sposob na tworzenie watkow kt�r� wykonujemy poprzez implementacje interfejsu
public class MyThreadRunnable implements Runnable {
	
	private int name;
	
	public MyThreadRunnable(int name) {
		super();
		this.name = name;
	}



	@Override
	public void run() {
		System.out.println("wykona� sie watek o nazwie " + name);
		
	}

}
