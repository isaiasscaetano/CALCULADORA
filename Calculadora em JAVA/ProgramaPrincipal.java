import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("[1] - SOMA, [2] - SUBTRAÇÃO, [3] - MULTIPLICAÇÃO, [4] - DIVISÃO, [5] - SAIR");

        int opcao = input.nextInt();

        Calculadora cal = new Calculadora();
        double n1, n2;
        while(opcao != 5){
            if (opcao == 1){
                System.out.println("Informe o primeiro numero: ");
                n1 = input.nextDouble();
                System.out.println("Informe o segundo numero: ");
                n2 = input.nextDouble();
                cal.setNumeros(n1, n2);
                System.out.println("SOMA = " + cal.Soma());
            } else if (opcao == 2){
                System.out.println("Informe o primeiro numero: ");
                n1 = input.nextDouble();
                System.out.println("Informe o segundo numero: ");
                n2 = input.nextDouble();
                cal.setNumeros(n1, n2);
                System.out.println("SUBTRAÇÃO = " + cal.Subtracao());
            } else if (opcao == 3){
                System.out.println("Informe o primeiro numero: ");
                n1 = input.nextDouble();
                System.out.println("Informe o segundo numero: ");
                n2 = input.nextDouble();
                cal.setNumeros(n1, n2);
                System.out.println("MULTIPLICAÇÃO = " + cal.Multiplicacao());
            } else if (opcao == 4){
                System.out.println("Informe o primeiro numero: ");
                n1 = input.nextDouble();
                System.out.println("Informe o segundo numero: ");
                n2 = input.nextDouble();
                cal.setNumeros(n1, n2);
                System.out.println("DIVISÃO = " + cal.Divisao());
            } else {
                System.out.println("Opção inválida!");
            }
            System.out.println("[1] - SOMA, [2] - SUBTRAÇÃO, [3] - MULTIPLICAÇÃO, [4] - DIVISÃO, [5] - SAIR");
            opcao = input.nextInt();
        }
        System.out.println("Obrigado por utilizar a calculadora.");
    }
}