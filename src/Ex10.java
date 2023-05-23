import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int number1, number2, number3;
		
		System.out.println("Insira o primeiro numero: ");
		number1 = leitor.nextInt();
		
		System.out.println("Insira o primeiro numero: ");
		number2 = leitor.nextInt();
		
		System.out.println("Insira o primeiro numero: ");
		number3 = leitor.nextInt();
		int maior = 0;
		
		if (number1 >= number2) {
			maior = number1;
		} else {
			maior = number2;
		}
		if (maior >= number3) {
			System.out.println("O numero de maior valor é " + maior);
		} else {
			System.out.println("O numero de maior valor é " + number3);
		}
	}
	}

