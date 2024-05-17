import java.util.Scanner;

public class Aula6 {
  // ARRAY/VETOR
  public static void main(String[] args) {
    
    /* 
    // int n1, n2, n3, n4, n5; // O Array abaixo simplifica isso
    // Os [] indicam que é um array
    int[] num = new int [5];
    int[] numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

    // Constante
    final int tam = 5;
    int[] num2 = new int [tam];

    // Adicionando valores no array
    num[0] = 10;
    num[1] = 20;
    num[2] = 30;
    num[3] = 40;
    num[4] = 50;

    System.out.print(" \n");

    System.out.printf("%d%n", num[0]);
    System.out.printf("%d%n", numeros[3]);

    System.out.print(" \n");

    // LOOPS EM ARRAY
    // FOR É RECOMENDADO POIS SABEMOS QUANTOS ELEMENTOS HÁ NO ARRAY
    for(int i = 0; i < numeros.length; i ++) {
      System.out.printf("%d - ", numeros[i]);
      
    }

    System.out.print(" \n");
    System.out.print(" \n");

    for(int i = 0; i < 5; i ++) {
      System.out.printf("%d - ", num2[i]);
    }

    System.out.print(" \n");
    */

    // ATIVIDADE:

    final int tam = 5;

    char [] gabarito = {'a', 'a', 'b', 'c', 'd'};
    char [] respostas = new char[tam];

    int nota = 0; // Se não declarar o valor padrão é 0 ou vazio

    Scanner scan = new Scanner(System.in);

    // Sem digitar
    // respostas[0] = 'a';
    // respostas[1] = 'a';
    // respostas[2] = 'c';
    // respostas[3] = 'c';
    // respostas[4] = 'd';

    for(int i = 0; i < tam; i++) {
      
      // Sem digitar
      // if(respostas[i] == gabarito[i]) {
      //   nota++;
      // }

      System.out.printf("Informe a resposta da questão %d: ", i);
      respostas[i] = scan.nextLine().charAt(0);

    }

    for(int i = 0; i < tam; i ++) {
      if (respostas[i] == gabarito[i]) {
        nota ++;
      }
    }

    System.out.printf("%nNota do aluno: %d", nota);
  }
}
