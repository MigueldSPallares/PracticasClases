package principal;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int tam;
		
		Usuario usu = new Usuario("Juan");
		usu.a�adirContrase�a();
		usu.a�adirContrase�a();
		usu.a�adirContrase�a();
		usu.verTodasContrase�as();
		
		Password p = new Password();
		
		System.out.println("Dime el tama�o del vector");
		tam = leer.nextInt();
		Password[] password = new Password[tam];
		boolean[] vSeguridad = new boolean[tam];
		System.out.println("Dime la longitud de las contrase�as");
		int longitud;
		leer = new Scanner(System.in);
		longitud = leer.nextInt();
		for(int i=0; i<tam; i++) {
			password[i] =  new Password(longitud);
			vSeguridad[i] = password[i].esFuerte();
			System.out.println(password[i].getContrase�a() + " - " + vSeguridad[i]);
		}
	}
}
