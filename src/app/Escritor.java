package app;

import java.util.ArrayList;

public class Escritor implements Objeto, Runnable{
	@Override
	public void acesso(ArrayList<String> palavras, int pos) {
		palavras.set(pos, "MODIFICADO");
	}

	@Override
	public void run() {
		
	}

}
