import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		double salario, aliquota1 = 0, aliquota2 = 7.5, aliquota3 = 15, aliquota4 = 22.5, aliquota5 = 27.5;
		double imposto, deducao1 = 128.31, deducao2 = 320.60, deducao3 = 577.00, deducao4 = 790.58;
		
		System.out.println("Insira o valor de seu salário:");
		salario = leitor.nextDouble();
		
		if (salario <= 1710.78) {
			imposto = aliquota1;
			System.out.println("Valor a pagar: " + imposto);
			
		} else if (salario <= 2563.91) {
			imposto = (aliquota2 * salario)/100 - deducao1;
			System.out.println("Valor a pagar: " + imposto);
		}else if (salario <= 3418.59) {
			imposto = (aliquota3 * salario)/100 - deducao2;
			System.out.println("Valor a pagar: " + imposto);
		} else if (salario <= 4271.59) { 
			imposto = (aliquota4 * salario)/100 - deducao3;
			System.out.println("Valor a pagar: " + imposto);	
			}else {
				imposto = (aliquota5 * salario)/100 - deducao4;
				System.out.println("Valor a pagar: " + imposto);	
			}
		leitor.close();
		}
	}