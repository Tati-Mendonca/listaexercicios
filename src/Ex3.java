import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int numero;
		
		System.out.println("Insira um numero: ");
		numero = leitor.nextInt();
		
		
		 if ((numero % 2) == 0) {
			 System.out.println("O numero é par"); 
			 } else
		 System.out.println("O numero é impar " + numero);
		 
		
		leitor.close();
		
	}
}
