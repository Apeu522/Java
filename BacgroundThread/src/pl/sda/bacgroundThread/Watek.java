package pl.sda.bacgroundThread;

public class Watek extends Thread
{
    
    public Watek(String name)
    {
	setName(name);
    }

    public void run()
    {
	
	
	
				//Miejsce na sockety
	
	
	
	
	boolean isFinish = false;
	while(!isFinish)//albo zeby zamkn�� ten w�tek bez zb�dnego pierdolenia
	{		//wpisa� while(!this.isIterupted) i ju�!!
	    
	   
	    if (this.isInterrupted())
	    {
		System.out.println("Dosta�em polecenie zamkni�cia");
		isFinish = true;
	    }
		
	    String name = getName();
	    try
	    {
		Thread.sleep(1000);
	    } catch (InterruptedException e)
	    {
		e.printStackTrace();
	    }
	
	    System.out.println("TEN W�TEK �YJE !!! " + name);
	   
	}
	
	
	
	
			//Miejsce na zamkni�cie socket�w itd itp !
	
	
	
	
    }
    
    public void Finalize()
    {
	
    }
    
}
