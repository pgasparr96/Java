package control;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientEcho {
	public static void main(String[] args) {
		Socket sckEcho;
		InputStream canalEntrada; //leitor do fluxo de entrada do socket.
		OutputStream canalSaida;
		BufferedReader entrada;
		PrintWriter saida;
		
		try {
			socket = new Socket("127.0.0.1", 4000);
			canalEntrada = socket.getInputStream();
			canalSaida
		}
	}
}
