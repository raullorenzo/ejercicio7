package edu.upc.eetac.dsa.rlorenzo.ejercicio7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class DaytimeTCPClient {
    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.err.println("You have to pass the server name and the server port");
            System.exit(-1);
        }
        String server = args[0];
        int port = Integer.parseInt(args[1]);

        Socket socket = new Socket(server, port);
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String time = reader.readLine();
        System.out.println(time);
    }
}