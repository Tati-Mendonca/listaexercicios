import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		double nota;
		
		System.out.println("Insira uma nota: ");
		nota = leitor.nextDouble();
		
		if (nota >=0 && nota <10) {
			System.out.println("Nota válida");
		} else
			System.out.println("Nota inválida");

	}
}
