package principal;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int tam;
		
		Password p = new Password();
		System.out.println(p.esFuerte("ASDcvbn123456"));
		
		System.out.println("Dime el tamaño del vector");
		tam = leer.nextInt();
		Password[] password = new Password[tam];
		System.out.println("Dime la longitud de las contraseñas");
		int longitud;
		leer = new Scanner(System.in);
		longitud = leer.nextInt();
		for(int i=0; i<tam; i++) {
			password[i] =  new Password(longitud);
		}
		
	}
}
