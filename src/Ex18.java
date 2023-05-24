import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int n1,n2,n3, intermediario;
	
		System.out.println("Digite o primeiro número: ");
		n1 = leitor.nextInt();
		
		System.out.println("Digite o segundo número: ");
		n2 = leitor.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		n3 = leitor.nextInt();
		
		if (n1>n2 & n2>n3) {
			intermediario = n2;
			System.out.println(intermediario);
		}else if (n2>n3 & n3>n1) {
			intermediario = n3;
			System.out.println(intermediario);
		}else if (n3>n1 & n1>n2) {
			intermediario = n1;
			System.out.println(intermediario);
		}else if (n3> n2 & n2>n1) {
			intermediario = n2;
			System.out.println(intermediario);
		}else {
			System.out.println("Os números não são diferente");
		}leitor.close();
	}
}

