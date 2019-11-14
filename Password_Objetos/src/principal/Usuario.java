package principal;

import java.util.Scanner;

public class Usuario {
	
	private String nombre;
	private Password[] vContraseñas;
	
	public Usuario() {
		nombre = "";
		vContraseñas = new Password[50];
	}
	
	public Usuario(String nombre, int numPassword) {
		this.nombre = nombre;
		vContraseñas = new Password[numPassword];
	}
	
	public Usuario(String nombre) {
		this.nombre = nombre;
		vContraseñas = new Password[50];
	}
	
	public void añadirContraseña() {
		Scanner leer = new Scanner(System.in);
		int tam;
		
		System.out.println("Dime el tamaño de la contraseña");
		tam = leer.nextInt();
		
		for (int i = 0; i < vContraseñas.length; i++) {
			if (vContraseñas[i]==null) {
				vContraseñas[i] = new Password(tam);
				break;
			}
		}
	}
	
	public void verTodasContraseñas() {
		for (int i = 0; i < vContraseñas.length; i++) {
			if (vContraseñas[i]!=null) {
				System.out.println(vContraseñas[i]);
			}
		}
	}
	public String toString() {
		String contraseñas = "";
		for (int i = 0; i < vContraseñas.length; i++) {
			if (vContraseñas[i]!=null) {
				contraseñas += vContraseñas[i];
			}
		}
		return nombre + "Contraseñas: \n " + contraseñas;
	}
	
}
