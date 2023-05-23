import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int idade;
		
		System.out.println("Insira sua idade: ");
		idade = leitor.nextInt(); 
		
	if(idade > 18) {
System.out.println("Você é maior de idade");
	}
	else 
System.out.println("Voce é menor de idade");
	 leitor.close();  
	}
}

