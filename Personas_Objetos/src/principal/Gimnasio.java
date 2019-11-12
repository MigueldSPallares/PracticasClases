package principal;

import java.util.Scanner;

public class Gimnasio {
	private String nombre;
	private String localizacion;
	private Persona[] vClientes;
	
	public Gimnasio() {
		nombre = "";
		localizacion = "";
		vClientes = new Persona[50];
	}

	public Gimnasio(String nombre) {
		this.nombre = nombre;
		localizacion = "";
		vClientes = new Persona[50];
	}

	public Gimnasio(String nombre, String localizacion) {
		this.nombre = nombre;
		this.localizacion = localizacion;
		vClientes = new Persona[50];
	}

	public Gimnasio(String nombre, String localizacion, int clientesMaximo) {
		this.nombre = nombre;
		this.localizacion = localizacion;
		this.vClientes = new Persona[clientesMaximo];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	public Persona[] getvClientes() {
		return vClientes;
	}

	public void añadirPersona() {
		Scanner leer = new Scanner(System.in);
		Scanner leerString = new Scanner(System.in);
		String nombre, dni;
		char sexo;
		double peso, altura;
		int edad;
		
		for (int i = 0; i < vClientes.length; i++) {
			if (vClientes[i] == null) {
				System.out.println("Dime el nombre");
				nombre = leerString.nextLine();
				if (nombre.equals("")) {
					vClientes[i] = new Persona();
					break;
				}
				System.out.println("Dime la edad");
				edad = leer.nextInt();
				System.out.println("Dime el sexo");
				sexo = leerString.next().charAt(0);
				leerString = new Scanner(System.in);
				System.out.println("Dime el DNI");
				dni = leerString.nextLine();
				if (dni.equals("")) {
					vClientes[i] = new Persona(nombre, edad, sexo);
					break;
				}
				System.out.println("Dime el peso");
				peso = leer.nextDouble();
				System.out.println("Dime la altura");
				altura = leer.nextDouble();
				vClientes[i] = new Persona(nombre, edad, sexo, peso, altura);
				break;
			}
		}
	}
	public void verTodasPersonas() {
		for (int i = 0; i < vClientes.length; i++) {
			if (vClientes[i]!=null) {
				System.out.println(vClientes[i]);
			}
		}
	}

	public Persona buscarPersona() {
		Scanner leer = new Scanner(System.in);
		String nombre;
		System.out.println("Dime el nombre de la persona a buscar");
		nombre = leer.nextLine();
		for (int i = 0; i < vClientes.length; i++) {
			if(vClientes[i]!=null && vClientes[i].getNombre().equalsIgnoreCase(nombre)) {
				return vClientes[i];
			}
		}
		return null;
	}
	
	public boolean borrarPersona() {
		Scanner leer = new Scanner(System.in);
		String nombre;
		System.out.println("Dime el nombre de la persona a borrar");
		nombre = leer.nextLine();
		
		for (int i = 0; i < vClientes.length; i++) {
			if (vClientes[i]!=null && vClientes[i].getNombre().equalsIgnoreCase(nombre)) {
				vClientes[i] = null;
				return true;
			}
		}
		
		return false;
	}
}
