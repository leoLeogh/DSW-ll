package com.example.demo.ejemplo;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	  private static final int PORT = 13;

	    public Server() {
	        try {
	            ServerSocket server = new ServerSocket(PORT);
	            System.out.println(" 1 > Server started at port " + PORT);
	            while (true) {
	                System.out.println("2 > Waiting for client...");
	                Socket client = server.accept();
	                System.out.println("3 > Client connected from " + client.getInetAddress());
	                


	                System.out.println("4 > Closing connection...");
	                client.close();
	            }
	        } catch (java.io.IOException e) {
	            e.printStackTrace();
	        }
	    }
	
	    public static void main(String[] args) {
	        new Server();
	    }
}
