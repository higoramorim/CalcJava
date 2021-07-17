import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args){
    System.out.println("CALCULADORA SIMPLES");

    int opcao;

    do {
      System.out.println("1 - Somar");
      System.out.println("2 - Subtrair");
      System.out.println("3 - Multiplicar");
      System.out.println("4 - Dividir");
      System.out.print("O que vc deseja fazer? (0 para sair)");
  
      Scanner scanner = new Scanner(System.in);
      opcao = scanner.nextInt();
      processar(opcao);
    } while (opcao != 0);
  }
  public static void processar (int opcao){
    Scanner scanner = new Scanner(System.in);
    switch (opcao){
      case 1: {
        System.out.println("somando dois números");
        System.out.println("digite o primeiro numero:");
        int numero1 = scanner.nextInt();
        System.out.println("digite o segundo numero:");
        int numero2 = scanner.nextInt();
        int soma = numero1 + numero2;

        System.out.println("a soma de dois numeros é: " + soma);
        break;
      }
      case 2: {
        System.out.println("somando dois números");
        System.out.println("digite o primeiro numero:");
        int numero1 = scanner.nextInt();
        System.out.println("digite o segundo numero:");
        int numero2 = scanner.nextInt();
        int subtracao = numero1 - numero2;

        System.out.println("a soma de dois numeros é: " + subtracao);
        break;
      }
      case 3: {
        System.out.println("somando dois números");
        System.out.println("digite o primeiro numero:");
        int numero1 = scanner.nextInt();
        System.out.println("digite o segundo numero:");
        int numero2 = scanner.nextInt();
        int multiplicacao = numero1 * numero2;

        System.out.println("a soma de dois numeros é: " + multiplicacao);
        break;
      }
      case 4: {
        System.out.println("somando dois números");
        System.out.println("digite o primeiro numero:");
        int numero1 = scanner.nextInt();
        System.out.println("digite o segundo numero:");
        int numero2 = scanner.nextInt();
        if (numero2 != 0){
          int divisao = numero1 / numero2;
          System.out.println("a divisao de dois numeros é: " + divisao);
        }
        numero2 = scanner.nextInt();
        break;
      }
    }
  }
}