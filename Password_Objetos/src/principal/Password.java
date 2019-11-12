package principal;

import java.util.Random;

public class Password {
	private int longitud;
	private String contraseņa;
	public Password() {
		longitud = 0;
		contraseņa = "";
	}
	public Password(int longitud) {
		this.longitud = longitud;
		contraseņa = generarPassword();
	}
	public boolean esFuerte() {
		return true;
	}
	public String generarPassword() {
		Random r = new Random();
		int num;
		contraseņa = "";
		for (int i = 0; i<longitud; i++) {
			num = r.nextInt(3);
			switch (num) {
			case 0:
				contraseņa = contraseņa + (char) r.nextInt(9) + 48;
				break;
			case 1:
				contraseņa = contraseņa + (char) r.nextInt(25) + 65;
				break;
			case 2:
				contraseņa = contraseņa + (char) r.nextInt(25) + 97;
				break;
				}
			}
		return contraseņa;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
}
