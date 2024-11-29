package ejercicio_ajedrez;
import java.util.Scanner;

public class ejercicio12 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Introduce un número mayor que 0 para el tamaño del tablero: ");
	        int n = scanner.nextInt();

	            System.out.println();  

	           
	            for (int i = 0; i < n; i++) { 
	               for (int j = 0; j < n; j++) {
	            	   
	                 System.out.print("|__");
	                 
	                }
	                System.out.println("|");
	            }
	        }
	    }
	

