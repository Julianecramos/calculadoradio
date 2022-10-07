import java.util.Scanner;

public class CalculadoraAritmeticas {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite Primeiro valor: ");
		Double primeiroNumero = scanner.nextDouble();

		System.out.print("Digite a opção desejada : 1-soma, 2-subtração, 3-multiplicação e 4-Divisão. ");
		Double tipoDeOperacao = scanner.nextDouble();

		System.out.print("Digite Segundo valor: ");
		Double segundoNumero = scanner.nextDouble();

		Double resposta = Double.valueOf(0);

		if (tipoDeOperacao == 1) {
			resposta = primeiroNumero + segundoNumero;
		}
		if (tipoDeOperacao == 2) {
			resposta = primeiroNumero - segundoNumero;
		}
		if (tipoDeOperacao == 3) {
			resposta = primeiroNumero * segundoNumero;
		}
		if (tipoDeOperacao == 4) {
			resposta = primeiroNumero / segundoNumero;
		}

		System.out.println("O resultado foi de : " + resposta);

		scanner.close();
	}

}
