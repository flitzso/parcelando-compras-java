import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor da compra: ");
        double valor = scanner.nextDouble();

        System.out.print("Informe o número de parcelas: ");
        int parcelas = scanner.nextInt();

        double valorParcela = valor / parcelas;

        System.out.printf("O valor da parcela é de R$ %.2f.\n", valorParcela);
    }

}