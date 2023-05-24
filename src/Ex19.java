import java.util.Scanner;

public class Ex19 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int n1,n2,n3, ladoA, ladoB, ladoC;
		System.out.println("Insira o primeiro lado do triangulo: ");
		n1 = leitor.nextInt();
		
		System.out.println("Insira o segundo lado do triangulo: ");
		n2 = leitor.nextInt();
		
		System.out.println("Insira o terceiro lado do triangulo: ");
		n3 = leitor.nextInt();
		
		ladoA = n1+n2;
		ladoB = n2+n3;
		ladoC = n3+n1;
		
		if (ladoA > n3 & ladoB > n1 & ladoC > n2) {
			System.out.println("Forma um triângulo");
		}		
		else {
			System.out.println("Não forma um triângulo");
		}leitor.close();
	}
}

