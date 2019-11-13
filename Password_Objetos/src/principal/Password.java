package principal;

import java.util.Random;

public class Password {
	private int longitud;
	private String contraseña;
	
	public Password() {
		longitud = 8;
		generarPassword(longitud);
	}
	public Password(int longitud) {
		this.longitud = longitud;
		generarPassword(longitud);
	}
	public boolean esFuerte() {
		int Mayusculas = 0;
		int Minusculas = 0;
		int Numeros = 0;
		for (int i = 0; i<contraseña.length(); i++) {
			if(contraseña.substring(i, i+1).equalsIgnoreCase(contraseña.substring(i, i+1).toUpperCase())) {
				Mayusculas = Mayusculas + 1;
			}else {
				if(contraseña.substring(i, i+1).equalsIgnoreCase(contraseña.substring(i, i+1).toLowerCase())){
					Minusculas = Minusculas + 1;
				}else {
					Numeros = Numeros + 1;
				}
			}
		}
		if(Mayusculas>=2 && Minusculas>=1 && Numeros>=5) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean esFuerte(String contraseña) {
		int Mayusculas = 0;
		int Minusculas = 0;
		int Numeros = 0;
		int valor;
		for (int i = 0; i<contraseña.length(); i++) {
			valor = (int) (contraseña.charAt(i));
			if(valor>=48 && valor<=57) {
				Numeros = Numeros + 1;
			}else {
				if(valor>=65 && valor<=90) {
					Mayusculas = Mayusculas + 1;
				}else {
					if(valor>=97 && valor<=122) {
						Minusculas = Minusculas + 1;
					}
				}
			}
		}
		if(Mayusculas>=2 && Minusculas>=1 && Numeros>=5) {
			return true;
		}else {
			return false;
		}
	}
	public void generarPassword(int longitud) {
		Random r = new Random();
		int num;
		contraseña = "";
		for (int i = 0; i<longitud; i++) {
			num = r.nextInt(3);
			switch (num) {
			case 0:
				contraseña = contraseña + (char) (r.nextInt(10) + 48);
				
				break;
			case 1:
				contraseña = contraseña + (char) (r.nextInt(25) + 65);
				
				break;
			case 2:
				contraseña = contraseña + (char) (r.nextInt(25) + 97);
				
				break;
				}
			}
	}
	
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public int getLongitud() {
		return this.longitud;
	}
	public String getContraseña() {
		return this.contraseña;
	}
}
