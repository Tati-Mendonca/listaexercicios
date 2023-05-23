import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int number;
		
		System.out.println("Insira um número por favor!");
		number = leitor.nextInt();
		
		if (number == 0) {
			System.out.println("Nulo");
		}else if (number < 0) {
			System.out.println("Negativo");
		} else {
			System.out.println("Positivo");
		}
		
	}

}
