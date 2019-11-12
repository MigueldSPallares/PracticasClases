package principal;

import java.util.Random;

public class Password {
	private int longitud;
	private String contrase�a;
	public Password() {
		longitud = 0;
		contrase�a = "";
	}
	public Password(int longitud) {
		this.longitud = longitud;
		contrase�a = generarPassword();
	}
	public boolean esFuerte() {
		return true;
	}
	public String generarPassword() {
		Random r = new Random();
		int num;
		contrase�a = "";
		for (int i = 0; i<longitud; i++) {
			num = r.nextInt(3);
			switch (num) {
			case 0:
				contrase�a = contrase�a + (char) r.nextInt(9) + 48;
				break;
			case 1:
				contrase�a = contrase�a + (char) r.nextInt(25) + 65;
				break;
			case 2:
				contrase�a = contrase�a + (char) r.nextInt(25) + 97;
				break;
				}
			}
		return contrase�a;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
}
