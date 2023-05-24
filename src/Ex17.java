import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		double av1, av2, media, provas, resultado;
		int a1, a2, a3, a4;
		
		System.out.println("Digite o valor da primeira Prova: ");
		av1 = leitor.nextDouble();
		
		System.out.println("Digite o valor da segunda Prova: ");
		av2 = leitor.nextDouble();
		
		System.out.println("Digite o valor da primeira Atividade: ");
		a1 = leitor.nextInt();
		
		System.out.println("Digite o valor da segunda Avaliação: ");
		a2 = leitor.nextInt();
		
		System.out.println("Digite o valor da terceira Avaliação: ");
		a3 = leitor.nextInt();
		
		System.out.println("Digite o valor da quarta Avaliação: ");
		a4 = leitor.nextInt();
		
		media = (av1 + av2)/2;
		provas = (media*60)/100;
		resultado = provas + a1 + a2 +a3 +a4;
		
		if (resultado == 6.0) {
			System.out.println("AV1 = "+resultado + ", Você está na média");
		} else if (resultado > 6.0) {
			System.out.println("AV1 = "+resultado + ", Você está acima da média");
		}
		else {
			System.out.println("AV1 = "+resultado + ", Você está abaixo da média");
		}
		leitor.close();
	}

}
