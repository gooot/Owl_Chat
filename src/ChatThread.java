import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ChatThread  extends Thread{
	
	static String HOSTIP= null;
	static int PORT = 5050;
	
	
	public void run() {
		
		Socket socket = new Socket();
		try {
			socket.bind(new InetSocketAddress(HOSTIP, PORT));
			socket.connect(new InetSocketAddress(HOSTIP, PORT));
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	

}

