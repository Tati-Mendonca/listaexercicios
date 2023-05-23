import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);  
		int numero1, numero2;
		
		System.out.println("Insira um numero: ");
		numero1 = leitor.nextInt();
		
		System.out.println("Insira outro numero: ");
		numero2 = leitor.nextInt();
		
		if (numero1 > numero2) {
			System.out.println("O numero de maior valor é: " + numero1);
		} else
			System.out.println("O numero de maior valor é: " + numero2);
	}

}
