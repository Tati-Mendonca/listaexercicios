import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int n1, n2, n3, maior, menor, meio;
		
		System.out.println("Por favor digite o primeiro número: ");
		n1 = leitor.nextInt();
		
		System.out.println("Por favor digite o segundo número: ");
		n2 = leitor.nextInt();
		
		System.out.println("Por favor digite o segundo número: ");
		n3 = leitor.nextInt();
		
		if (n1 >n2 & n2>n3) {
			menor = n3;
			meio = n2;
			maior = n1;
			System.out.println(menor+" "+meio+" "+maior);
		}else if (n2 >n1 & n1>n3) {
			menor = n3;
			meio = n1;
			maior = n2;
			System.out.println(menor+" "+meio+" "+maior);
		} 
		else if (n3 >n2 & n2 >n1) {
			menor = n1;
			meio = n2;
			maior = n3;
			System.out.println(menor+" "+meio+" "+maior);
		} 
		else if (n2>n3 & n3>n1) {
			menor = n1;
			meio = n3;
			maior = n2;
			System.out.println(menor+" "+meio+" "+maior);
		}
		else if (n3>n1 & n1>n2) {
			menor = n2;
			meio = n1;
			maior = n3;
			System.out.println(menor+" "+meio+" "+maior);
		}
		else if (n1> n3 & n3 >n2 ) {
			menor = n2;
			meio = n3;
			maior = n1;
			System.out.println(menor+" "+meio+" "+maior);
			
		}
		leitor.close();
	}
}
