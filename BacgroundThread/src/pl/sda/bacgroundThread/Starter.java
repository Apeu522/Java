package pl.sda.bacgroundThread;

public class Starter
{

    public static void main(String[] args)
    {
	Watek watek = new Watek("W¹tek1!!");
	Watek watek2 = new Watek("Mleko");
	watek.start();
	watek2.start();
	
	try
	{
	    Thread.sleep(5000);
	} catch (InterruptedException e)
	{
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	
//	watek.stop();
//	watek2.stop();
	watek.interrupt();
	watek2.interrupt();
    }

}
