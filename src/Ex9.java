import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		double av1,av2,av3, descarte;
		
		System.out.println("Insira a primeira nota: ");
		av1 = leitor.nextDouble();
		
		System.out.println("Insira a segunda nota: ");
		av2 = leitor.nextDouble();
		
		System.out.println("Insira a terceira nota: ");
		av3 = leitor.nextDouble();
		
		if (av1 <= av2 & av2 <= av3 ) {
			descarte = av1;
		
		}else if (av1 >= av2 & av2 >= av3) {
			descarte = av3;
		} else {
			descarte = av2;
		}
					
		double media;
		media = (av1 + av2 + av3)/3;
		if (media <=6) {
			System.out.println(media + " - Reprovado");
		}else {
			System.out.println(media + " - Aprovado");
		}
		leitor.close();
	}
}
