import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int ano;
		
		System.out.println("Insira o ano em que nasceu: ");
		ano = leitor.nextInt();
		
		if (ano %4 ==0) {
			System.out.println("É ano bissexto ");
		} else {
			System.out.println("Não é ano bissexto ");
		}leitor.close();
	}

}
