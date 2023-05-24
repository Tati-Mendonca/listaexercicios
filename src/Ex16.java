import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		double salario, resultado;
		int sexo, idade;
		double faixa1M = 5.34, faixa2M = 8.44, faixa3M = 10.12, faixa1F= 3.56, faixa2F = 6.43, faixa3F = 8.02;
		
		System.out.println("Digite o seu salario: ");
		salario = leitor.nextDouble();
		
		System.out.println("Informe o seu sexo: 1 para Masculino e 2 para Feminino");
		sexo = leitor.nextInt();
		
		System.out.println("Informe tambem sua idade: ");
		idade = leitor.nextInt();
		
		if (idade <=20 & sexo == 1) {
			resultado = (faixa1M * salario)/100;
			System.out.println("Valor do convenio: R$" + resultado);
		} else if (idade <=20 & sexo == 2) {
			resultado = (faixa1F * salario)/100;
			System.out.println("Valor do convenio: R$" + resultado);
		} else if (idade >20 & idade <=40 & sexo == 1) {
			resultado = (faixa2M * salario)/100;
			System.out.println("Valor do convenio: R$" + resultado);
		}else if (idade >20 & idade <=40 & sexo == 2) {
			resultado = (faixa2F * salario)/100;
			System.out.println("Valor do convenio: R$" + resultado);
		}else if (idade >40 & sexo == 1) {
			resultado = (faixa3M * salario)/100;
			System.out.println("Valor do convenio: R$" + resultado);
		}else if (idade >40 & sexo == 2) {
			resultado = (faixa3F * salario)/100;
			System.out.println("Valor do convenio: R$" + resultado);
		}else {
			System.out.println("error");
		}
		leitor.close();
	}

}
