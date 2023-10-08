package ClientPackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {



public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			try {
			System.out.println("je suis un client");
			//Socket socket =new Socket ("localhost",600);
			
			InetAddress inetAdress= InetAddress.getByName("10.25.13.246");
			InetSocketAddress inetSocketAdd =new InetSocketAddress(inetAdress,500);
			Socket socket =new Socket ();
			socket.connect(inetSocketAdd);
			
			System.out.println("je suis un client connecte");
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			int nb;
			System.out.println("nb =");
			Scanner scanner = new Scanner (System.in);
			nb=scanner.nextInt();
			os.write(nb);
			System.out.println("la multiplication de "+nb+"*5="+is.read());
			//System.out.println("laddition de "+nb+"+5="+is.read());
			System.out.println("deconnexion client");
			socket.close();
			}catch(Exception e) {e.printStackTrace();}

		


}}
	
	
	