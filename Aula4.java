import java.util.Scanner;

public class Aula4 {
  public static void main(String[] args) {

    
    Scanner scan = new Scanner(System.in);

    int n1 = 0, n2 = 0, n3 = 0, n4 = 0, soma = 0;
    // 'final' é uma constante, o valor não pode ser alterado
    final int media = 5;
    String nome = "", res = "";

    System.out.print("Digite o nome do aluno: ");
    nome = scan.nextLine();

    System.out.print("Digite a primeira nota: ");
    n1 = scan.nextInt();

    System.out.print("Digite a segunda nota: ");
    n2 = scan.nextInt();

    System.out.print("Digite a terceira nota: ");
    n3 = scan.nextInt();

    System.out.print("Digite a quarta nota: ");
    n4 = scan.nextInt();
  
    soma = (n1 + n2 + n3 + n4) / 4;

    if(soma >= media) {
      res = "Aprovado";
    } else if (soma >= 40) {
      res = "Recuperação";
    } else {
      res = "Reprovado";
    }

    System.out.printf("Aluno %s foi %s, com nota total de %d", nome, res, soma);

  }
}
