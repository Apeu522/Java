package pl.sda.multiServTCP;

public class Starter
{

    public static void main(String[] args)
    {
	MTServTCP serverTCP1 = new MTServTCP("pierwszy", 55555);
	
	MTServTCP serverTCP2 = new MTServTCP("drugi", 55556);
	
	
	serverTCP1.start();
	serverTCP2.start();
    }

}
