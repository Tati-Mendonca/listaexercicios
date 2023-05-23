import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		double nota1, nota2;
		
		System.out.println("Insira  a primeira nota: ");
		nota1 = leitor.nextDouble();
		
		if (nota1 <=0 || nota1 > 10) {
			System.out.println("Nota inválida!");
		
		} else {
			
			System.out.println("Insira  a segunda nota: ");
			nota2 = leitor.nextDouble();
			
			if (nota2 <=0 || nota2 > 10) {
				System.out.println("Nota inválida!");
			} else {
		
		
		double media= (nota1 + nota2) /2;
				
		if (nota1 >=0 || nota2 >=0) {
			
			if (media >5) {
				
				System.out.println("\"Você está aprovado! com média " + media);
			}
			else
				System.out.println("Você está reprovado com média " + media);
		}
			}

		}
	}

}
