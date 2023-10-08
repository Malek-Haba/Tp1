package ServerPackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		try {
		System.out.println("je suis un serveur");
		ServerSocket serversocket = new ServerSocket(600);
		System.out.println("je suis un serveur j'attends un client");
		Socket socket = serversocket.accept();
		System.out.println("un client est connecte");
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		int nb = is.read();
		int rep =nb*5;
		os.write(rep);
		System.out.println("deconnexion serveur");
		socket.close();
        serversocket.close();
		}catch (Exception e) {e.printStackTrace();}
}}