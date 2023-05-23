import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.println("Por favor insira o primeiro numero: ");
		num1 = leitor.nextInt();
		
		System.out.println("Por favor insira o segundo numero: ");
		num2 = leitor.nextInt();
		
		System.out.println("Por favor insira o terceiro numero: ");
		num3 = leitor.nextInt();
		
		if (num1 == num2 & num2 == num3) {
			System.out.println("3 números são iguais");
			
		}else if (num1 != num2 & num2 == num3 | num3 != num1 & num1 == num2 |num1 == num3 & num3 != num2) {
				System.out.println("2 dos 3 numeros são iguais");
			} else {
				System.out.println("3 números diferentes");
			}
		}
	}



