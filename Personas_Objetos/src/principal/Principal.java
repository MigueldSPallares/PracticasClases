package principal;

import java.util.Scanner;

public class Principal {
	
	private static void añadirPersona(Persona[] vClientes) {
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
	//Devuelvo null si no encuentro la persona, sino la persona
	private static Persona buscarPersona(Persona[] v) {
		Scanner leer = new Scanner(System.in);
		String nombre;
		System.out.println("Dime el nombre de la persona a buscar");
		nombre = leer.nextLine();
		for (int i = 0; i < v.length; i++) {
			if(v[i]!=null && v[i].getNombre().equalsIgnoreCase(nombre)) {
				return v[i];
			}
		}
		return null;
	}
	
	private static void verTodasPersonas(Persona[] vClientes) {
		for (int i = 0; i < vClientes.length; i++) {
			if (vClientes[i]!=null) {
				System.out.println(vClientes[i]);
			}
		}
	}
	
	private static boolean borrarPersona(Persona[] vClientes) {
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
	
	private static void editarPersona(Persona persona) {
		Scanner leer2 = new Scanner(System.in);
		System.out.println("Dime el nuevo nombre");
		persona.setNombre(leer2.nextLine());
	}
	
	public static void main(String[] args) {
		Gimnasio gim = new Gimnasio("InfoGim", "Alcañiz", 20);
		Persona[] vClientes = new Persona[100];
		Menu menu = new Menu();
		int opc = 0;
		
		do {
			opc = menu.pintaMenuPrincipal(); 
			switch (opc) {
			case 1:
				gim.añadirPersona();
				añadirPersona(vClientes);
				break;
			case 2:
				Persona persona = buscarPersona(vClientes);
				if (persona == null) {
					System.out.println("No se ha encontrado la persona");
				}else {
					int opc2 = 0;
					//Trabajo con la persona
					do {
						opc2 = menu.pintaMenuPersona();
						switch (opc2) {
						case 1:
							if(persona.esMayorDeEdad()) {
								System.out.println("Es mayor de edad");
							}else {
								System.out.println("No es mayor de edad");
							}
							break;
						case 2:
							switch (persona.calcularIMC()) {
							case -1:
								System.out.println(persona.getNombre() + " su IMC es inferior a lo normal.");
								break;
							case 0:
								System.out.println(persona.getNombre() + " su IMC es perfecto.");
								break;
							case 1:
								System.out.println(persona.getNombre() + " su IMC es superior a lo normal");
								break;

							default:
								break;
							}
							break;
						case 3:
							System.out.println(persona);
							break;
						case 4:
							editarPersona(persona);
							break;
						default:
							
							break;
						}
					}while (opc2!=5);
				}
				break;
			case 3:
				boolean borrado = borrarPersona(vClientes);
				if(borrado) {
					System.out.println("Persona borrada");
				}else {
					System.out.println("Persona no encontrada");
				}
				break;				
			case 4:
				verTodasPersonas(vClientes);
				break;				

			default:
				System.out.println("Adios");
				break;
			}
		}while(opc!=5);
		
	}

}
