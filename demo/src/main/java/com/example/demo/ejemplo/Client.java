package com.example.demo.ejemplo;

import java.net.Socket;

public class Client {
	
	private static final int PORT = 13;
    private static final String HOST = "localhost";

    public Client() {
        try {
            Socket socket = new Socket(HOST, PORT);
            System.out.println("1 > Connected to server at " + HOST + ":" + PORT);

            
            System.out.println("2 > Closing connection...");
            socket.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Client();
    }
}
