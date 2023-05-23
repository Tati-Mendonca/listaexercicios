import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		double salario;
		int sexo, masc, idade;
		
		System.out.println("DIgite o seu salario: ");
		salario = leitor.nextDouble();
		
		System.out.println("Informe o seu sexo: 1 para Masculino e 2 para Feminino");
		sexo = leitor.nextInt();
		
		if (sexo == 1) {
			System.out.println(1);
		} else {
			System.out.println(2);
		}
		
		System.out.println("Informe tambem sua idade: ");
		idade = leitor.nextInt();
		

	}

}
