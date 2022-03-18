package control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEcho {
	private ServerSocket sckServer;
	public ServerEcho() throws IOException {
		this.sckServer = new ServerSocket(4000);
		
		for (;;) {
			Socket sckEcho;
			
			Conversor conversor = new Conversor();
			
			
			InputStream EntryCh;
			OutputStream ExitCh;
			BufferedReader sventry;
			PrintWriter svexit;
			
			sckEcho = this.sckServer.accept();
			EntryCh = sckEcho.getInputStream();
			ExitCh = sckEcho.getOutputStream();
			sventry = new BufferedReader(new InputStreamReader(EntryCh));
			svexit = new PrintWriter(ExitCh, true);
			
			while (true) {
				String mensagem = sventry.readLine();
				if (mensagem == null || mensagem.length() == 0){
					break;
				}
				String msg = mensagem;
				try {
					Double resultado = conversor.conversortemp(msg);
					svexit.println("Temperatura convertida:" + resultado);
				} catch(NumberFormatException erro) {
					svexit.println("Formato incorreto" + msg);
				} catch(Exception e) {
					svexit.println("Erro!!!!");
				}
				
				
			}
		    sckEcho.close();
		}
	}
}
