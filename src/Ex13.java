import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		double salarioBruto, salarioLiquido;
		double inss, recolhimento1 = 8.00, recolhimento2 = 9.00, recolhimento3 = 11.00, teto = 468.00;
		
		double imposto, aliquota1 = 0, aliquota2 = 7.5, aliquota3 = 15, aliquota4 = 22.5, aliquota5 = 27.5;
		
		System.out.println("Digite o valor de seu salário bruto: ");
		salarioBruto = leitor.nextDouble();
		
		if (salarioBruto <1247.70) {
			inss = (recolhimento1 * salarioBruto)/100;
			salarioLiquido = salarioBruto - inss;			
			System.out.println("Salario Bruto: R$" + salarioBruto +"\nINSS: R$" + Math.ceil(inss)+ "\nImposto: R$ " + aliquota1 + "\nLiquido: R$" + Math.ceil(salarioLiquido));
		
		} else if (salarioBruto < 2079.50 & salarioBruto <= 2563.91) {
			inss = (recolhimento2 * salarioBruto)/100;
			imposto = (aliquota2 * salarioBruto)/100;
			salarioLiquido = salarioBruto - inss - imposto;
			
			System.out.println("Salario Bruto: R$" + salarioBruto +"\nINSS: R$" + Math.ceil(inss)+ "\nImposto: R$ " +  Math.ceil(imposto) + "\nLiquido: R$" + Math.ceil(salarioLiquido));
			
		}else if (salarioBruto < 4159.00 & salarioBruto <= 3418.59) {
			
			inss = (recolhimento3 * salarioBruto)/100;
			imposto = (aliquota3 * salarioBruto)/100;
			salarioLiquido = salarioBruto - inss - imposto;
			
			System.out.println("Salario Bruto: R$" + salarioBruto +"\nINSS: R$" + Math.ceil(inss)+ "\nImposto: R$ " +  Math.ceil(imposto) + "\nLiquido: R$" + Math.ceil(salarioLiquido));
		} else if (salarioBruto <4159.00 & salarioBruto <= 4271.59) {
			inss = (recolhimento3 * salarioBruto)/100;
			imposto = (aliquota4 * salarioBruto)/100;
			salarioLiquido = salarioBruto - inss - imposto;
			
			System.out.println("Salario Bruto: R$" + salarioBruto +"\nINSS: R$" + Math.ceil(inss)+ "\nImposto: R$ " +  Math.ceil(imposto) + "\nLiquido: R$" + Math.ceil(salarioLiquido));
		}else{
			inss = teto;
			imposto = (aliquota5 * salarioBruto)/100;
			salarioLiquido = salarioBruto - inss - imposto;
			System.out.println("Salario Bruto: R$" + salarioBruto +"\nINSS: R$" + Math.ceil(inss)+ "\nImposto: R$ " +  Math.ceil(imposto) + "\nLiquido: R$" + Math.ceil(salarioLiquido));
		}{
			
		}
		leitor.close();
		
	}

}
