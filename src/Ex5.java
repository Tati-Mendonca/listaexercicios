import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);
		double nota1, nota2;
//		int nota1, nota2;
		
		System.out.println("Insira  a primeira nota: ");
		nota1 = leitor.nextDouble();
//		nota1 = leitor.nextInt();
		
		System.out.println("Insira  a segunda nota: ");
		nota2 = leitor.nextDouble();
//		nota2 = leitor.nextInt();
		
		double media = (nota1 + nota2) /2;
		
		if (media >5) {
			System.out.println("Você está aprovado! com média " + media );
		}
		else 
			System.out.println("Você está reprovado com média " + media);
	}

}
