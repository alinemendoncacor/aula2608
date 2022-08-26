import java.util.Scanner;
public class Conversao {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double dia, mes, ano;
		//ler a qtde de dias
		
		System.out.println("Entre com a qtde de dias a se converter:");
		dia = ler.nextDouble();
		mes = dia/30;
		ano = dia/365;
		
		System.out.println(dia+" dias convertidos em meses é = "+mes+ " meses e convertido em anos = "+ano+" anos");
		
	}

}
