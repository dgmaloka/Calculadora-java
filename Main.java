import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double numero1 = entrada.nextDouble();

        System.out.println("Digite o segundo número:");
        double numero2 = entrada.nextDouble();

        System.out.println("Digite a operação (+, -, *, /):");
        char operacao = entrada.next().charAt(0);

        switch (operacao) {
            case '+':
                System.out.printf("Resultado: %.2f%n", numero1 + numero2);
                break;
            case '-':
                System.out.printf("Resultado: %.2f%n", numero1 - numero2);
                break;
            case '*':
                System.out.printf("Resultado: %.2f%n", numero1 * numero2);
                break;
            case '/':
                if (numero2 == 0) {
                    System.out.println("Não é possível dividir por 0!");
                } else {
                    System.out.printf("Resultado: %.2f%n", numero1 / numero2);
                }
                break;
            default:
                System.out.println("Operação inválida!");
        }

        entrada.close();
    }
}
