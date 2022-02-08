import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		int[] vetor = new int[5]; // Variável local
		preencher(vetor); // Argumento do método --> variável que será enviada
		int maior = maiorValor(vetor);
		int menor = menorValor(vetor);

		System.out.println("Maior valor = " + maior);
		System.out.println("Menor valor = " + menor);
	}

	public static int maiorValor(int[] vetor) {
		
		int aux = vetor[0];

		for (int i = 1; i < vetor.length; i++) {
			if (vetor[i] > aux) {
				aux = vetor[i];

			} // fecha if

		} // fecha for

		return aux;

	}

	public static int menorValor(int[] vetor) {
		
		int aux = vetor[0];

		for (int i = 1; i < vetor.length; i++) {
			if (vetor[i] < aux) {
				aux = vetor[i];

			} // fecha if

		} // fecha for

		return aux;

	}

	public static void preencher(int[] vetor) {// vetor é um parâmetro dentro do método

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º valor: ");
			vetor[i] = entrada.nextInt();

		} // Fecha for
		entrada.close(); // Fechar o alerta

	}

}
