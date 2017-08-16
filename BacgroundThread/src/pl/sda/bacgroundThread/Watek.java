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
	while(!isFinish)//albo zeby zamkn¹æ ten w¹tek bez zbêdnego pierdolenia
	{		//wpisaæ while(!this.isIterupted) i ju¿!!
	    
	   
	    if (this.isInterrupted())
	    {
		System.out.println("Dosta³em polecenie zamkniêcia");
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
	
	    System.out.println("TEN W¥TEK ¯YJE !!! " + name);
	   
	}
	
	
	
	
			//Miejsce na zamkniêcie socketów itd itp !
	
	
	
	
    }
    
    public void Finalize()
    {
	
    }
    
}
