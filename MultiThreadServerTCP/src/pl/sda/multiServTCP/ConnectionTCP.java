package pl.sda.multiServTCP;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;



public class ConnectionTCP extends Thread
{
    Socket connectionSocket = null;
    String serverMessage = "HTTP/1.1 200 OK\r\n\r\n"
    	+ "<html>\r\n"
    	+ "<head>\r\n"
    	+ "</head>\r\n"
    	+ "<body>\r\n"
    	+ "<center>\r\n"
    	+ "Witam Na Serwerze Apeua !!!\r\n"
    	+ "</center>\r\n"
    	+ "<br><br>\r\n"
    	+ "<center> <b> elo elo 5 2 0 !!! KURWA TO DZIA£A !!!</b>\r\n"
    	+ "</body>\r\n"
    	+ "</html>";
    
    byte[] buffer = new byte[15000];
    
    public ConnectionTCP(Socket connectedSocket)
    {
	this.connectionSocket = connectedSocket;
    }
    
    public void run()
    {
	InputStream inputStream = null;
	OutputStream outputStream = null;
	
	
	buffer = serverMessage.getBytes();
	
	 try{
	    outputStream = connectionSocket.getOutputStream();
	    inputStream = connectionSocket.getInputStream();
	} catch (IOException e){
	    e.printStackTrace();
	}
	 try{
	    outputStream.write(buffer);
	} catch (IOException e){
	    e.printStackTrace();
	} 
	
    }
    
    
    
    
    
    

}
