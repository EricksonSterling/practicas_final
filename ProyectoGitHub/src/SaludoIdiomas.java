import java.util.Scanner;
public class Acti_14 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escribe el nombre: ");
		String nombre = scan.nextLine();

		System.out.print("a) Valenciano\nb) Castellano\nc) Ingles" + "\nEscoge una letra para el idioma: " );
		String cod = scan.nextLine();
		
		saludo(nombre, cod);
	}
	
	public static void saludo(String nombre, String cod) {
		
		if (cod == "a"|| cod == "b" || cod == "c") {
			
			switch (cod) {
				
				case "a":
						
						System.out.println("Bon dia " + nombre + ".");
						break;
				
				case "b":
						
						System.out.println("Buenos dias " + nombre + ".");
						break;
				
				case "c":
					
						System.out.println("Good morning " + nombre + ".");
						break;
			}
		}else {
			System.out.println("Escribir 'a', 'b' o 'c'.");
		}
	}
}
