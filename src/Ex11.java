import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		double salario, imposto, recolhimento1 = 8.00, recolhimento2 = 9.00, recolhimento3 = 11.00, teto = 468.00;
		
		System.out.println("Insira o valor de seu salário:");
		salario = leitor.nextDouble();
		
		
		if (salario <1247.70) {
			imposto = (recolhimento1 * salario)/100;
			System.out.println("Pagar R$ " +imposto);
		} else if (salario < 2079.50) {
			imposto = (recolhimento2 * salario)/100;
			System.out.println("Pagar R$ " +imposto);
		}else if (salario < 4159.00) {
			imposto = (recolhimento3 * salario)/100;
			System.out.println("Pagar R$ " +imposto);
		} else{
			System.out.println("Pagar R$ " + teto);
		}
		leitor.close();
		}
	}

