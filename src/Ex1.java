import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		
		 Scanner leitor = new Scanner(System.in);  //Abri o Scaner para coletar informação
		 
		 int numero;                               //Declarei a variavel
		 
		 System.out.println("Insira um numero: "); //Inseri o texto para saida de dados
		 
		 numero = leitor.nextInt();                //Usei o Scanner para ler o dado coletado
		 
			
			 if (numero > 0) { System.out.println("O numero e positivo");
			 }
			 else 
					System.out.println("O numero e negativo");
			 
			 leitor.close();                       //Encerrei a classe Scanner

	}

}
