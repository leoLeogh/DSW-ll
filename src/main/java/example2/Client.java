package example2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Random;

public class Client {
	private static final int PORT = 13;
    private static final String HOST = "localhost";

        public Client() {
            try {
                Socket socket = new Socket(HOST, PORT);
                System.out.println("1 > Connected to server at " + HOST + ":" + PORT);

                // flujos de comunicación
                BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);

                String[] mensajes = {"PLATEA", "VIP", "PLATINIUM"};
                Random random = new Random();
                int index = random.nextInt(mensajes.length);
                String mensaje = mensajes[index];
                System.out.println("2 > Enviando mensaje al servidor: " + mensaje);

                // enviar mensaje al servidor
                salida.println(mensaje);

                // se recibe el mensaje del servidor (precio)
                String respuesta = entrada.readLine();
                System.out.println("3 > Respuesta del servidor: " + respuesta);

                System.out.println("4 > Closing connection...");
                socket.close();
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
        }

        public static void main(String[] args) {
            new Client();
        }
}
