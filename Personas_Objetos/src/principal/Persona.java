package principal;

public class Persona {
	private	String nombre;
	private	int edad;
	private	String dni;
	private	char sexo;
	private	double peso;
	private double altura;
	private final char hombre = 'H';
	
	public Persona() {
		nombre = "";
		edad = 0;
		dni = generarDNI();
		sexo = hombre;
		peso = 0;
		altura = 0;
	}
	
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		dni = generarDNI();
		this.sexo = sexo;
		peso = 0;
		altura = 0;
	}
	
	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		dni = generarDNI();
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	public int calcularIMC() {
		double imc=0;
		final int bajoPeso = -1;
		final int pesoCorrecto = 0;
		final int sobrePeso = 1;
		
		imc = peso/(altura*altura);
		
		if (imc<18.5) {
			return bajoPeso;
		}else if(imc <= 25) {
			return pesoCorrecto;
		}else {
			return sobrePeso;
		}
	}
	
	public boolean esMayorDeEdad() {
		if(edad<18) {
			return true;
		}else {
			return false;
		}
	}
	
	private void comprobarSexo(char sexo) {
		if(sexo != 'H' && sexo != 'M') {
			sexo = 'H';
		}
	}
	
	public String toString() {
		return "Persona [nombre: " + nombre + ", edad: " + edad + ", DNI: " + dni + ", sexo: " + sexo + ", peso: " + peso + ", altura:" + altura + "]";
	}
	
	private String generarDNI() {
		String numDNI = "";
		for (int i = 0; i < 8; i++) {
			int num = (int) (Math.random()*10+1);
			numDNI = numDNI + Integer.toString(num);
		}
		String[] vLetra = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		int i = Integer.valueOf(numDNI) % 23;
		dni = numDNI + vLetra[i];
		
		return dni;
	}
	
	public void setNombre() {
		this.nombre = nombre;
	}
	public void setEdad() {
		this.edad = edad;
	}
	public void setSexo(){
		this.sexo = sexo;
	}
	public void setPeso() {
		this.peso = peso;
	}
	public void setAltura() {
		this.altura = altura;
	}
}
