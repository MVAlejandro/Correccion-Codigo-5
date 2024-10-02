
// El programa recibe un número positivo, luego analiza cada dígito de éste y determia cuántos 
// de ellos son considerados afortunados, en este caso 3, 7, 8 o 9. 
// Al final imprime un mensaje que indica si el número ingresado tiene más digitos afortunados 
// denominandolo un "número afortunado" o más digitos no afortunados y denominandolo un 
// "número no afortunado".

import java.util.Scanner; // Se importa la clase Scanner

public class Codigo5 {
	public static void main(String[] args) { // Se agrega el metodo main
		Scanner s = new Scanner(System.in); // Se agrega el input para el scanner
	    
		System.out.print("Introduzca un número: "); // Se corrigen las comillas
		int ni = s.nextInt(); // Se cambia el tipo de variable para ahorrar la conversión
		int c = ni;
		    
		int afo = 0;
		int noAfo = 0;
		    
		while (ni > 0) {
			int digito = (int)(ni%10);
		    if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
				afo++;
		    } else {
		    	noAfo++;
		    } // else
		    ni /= 10;
		} // while
		    
		if (afo > noAfo) { // Se saca este condicional del bucle
			System.out.println("El " + c + " es un número afortunado."); // Se completa la sentencia "println"
		} else {
		    System.out.println("El " + c + " no es un número afortunado.");
		} // else
		    
		s.close(); // Se cierra el scanner
	} // main 
} // class Codigo5