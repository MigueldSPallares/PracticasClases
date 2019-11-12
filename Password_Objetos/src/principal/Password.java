package principal;

import java.util.Random;

public class Password {
	private int longitud;
	private String contraseña;
	public Password() {
		longitud = 0;
		contraseña = "";
	}
	public Password(int longitud) {
		this.longitud = longitud;
		contraseña = generarPassword();
	}
	public boolean esFuerte() {
		return true;
	}
	public String generarPassword() {
		Random r = new Random();
		int num;
		contraseña = "";
		for (int i = 0; i<longitud; i++) {
			num = r.nextInt(3);
			switch (num) {
			case 0:
				contraseña = contraseña + (char) r.nextInt(9) + 48;
				break;
			case 1:
				contraseña = contraseña + (char) r.nextInt(25) + 65;
				break;
			case 2:
				contraseña = contraseña + (char) r.nextInt(25) + 97;
				break;
				}
			}
		return contraseña;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
}
