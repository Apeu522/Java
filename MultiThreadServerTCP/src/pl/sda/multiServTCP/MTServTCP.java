package pl.sda.multiServTCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MTServTCP extends Thread
{
    private int port;
    public int getPort() 
    {
	return port;
    }
    
    
    public MTServTCP(String name, int port)
    {
	setName(name);
	this.port = port;
	System.out.println("Tworzenie po porcie: " + port);
	try{
	    Thread.sleep(500);
	} catch (InterruptedException e){
	    e.printStackTrace();
	}
	System.out.println("Koniec tworzenia" + port);
	
    }
    
    public void run()
    {
	int licznik = 1;
	int Local_port = port;
	int Remote_Port = 0;
	Socket connectedSocket = null;
	InputStream inputStream = null;
	OutputStream outputStream = null;
	
        ServerSocket serverSocket = null;
        	try{
        	    serverSocket = new ServerSocket(Local_port);
        	} catch (IOException e){
        	    e.printStackTrace();
        	}
        	
        while(!this.isInterrupted())
        {
            System.out.println("Nawi¹zano po³¹czenie nr " + licznik + " port: " + port);
        	try{
        	    connectedSocket = serverSocket.accept();
        	    inputStream = connectedSocket.getInputStream();
        	    outputStream = connectedSocket.getOutputStream();
        	} catch (IOException e){
        	    e.printStackTrace();
        	}
        	
        	licznik++;
        	
        	ConnectionTCP client = new ConnectionTCP(connectedSocket);
        	client.start();
	
	}
        
        try {
		inputStream.close();
		outputStream.close();
		outputStream.flush();
		connectedSocket.close();
		serverSocket.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
	
	
	
	
	
	
    }
    
    
    
    
    
    
}
