package principal;

import java.util.Scanner;

public class Usuario {
	
	private String nombre;
	private Password[] vContrase�as;
	
	public Usuario() {
		nombre = "";
		vContrase�as = new Password[50];
	}
	
	public Usuario(String nombre, int numPassword) {
		this.nombre = nombre;
		vContrase�as = new Password[numPassword];
	}
	
	public Usuario(String nombre) {
		this.nombre = nombre;
		vContrase�as = new Password[50];
	}
	
	public void a�adirContrase�a() {
		Scanner leer = new Scanner(System.in);
		int tam;
		
		System.out.println("Dime el tama�o de la contrase�a");
		tam = leer.nextInt();
		
		for (int i = 0; i < vContrase�as.length; i++) {
			if (vContrase�as[i]==null) {
				vContrase�as[i] = new Password(tam);
				break;
			}
		}
	}
	
	public void verTodasContrase�as() {
		for (int i = 0; i < vContrase�as.length; i++) {
			if (vContrase�as[i]!=null) {
				System.out.println(vContrase�as[i]);
			}
		}
	}
	public String toString() {
		String contrase�as = "";
		for (int i = 0; i < vContrase�as.length; i++) {
			if (vContrase�as[i]!=null) {
				contrase�as += vContrase�as[i];
			}
		}
		return nombre + "Contrase�as: \n " + contrase�as;
	}
	
}
