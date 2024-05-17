public class Aula2 {
  public static void main(String[] args) {

    int num = 100;
    String nome = "Guilherme";

    System.out.print("\n");

    System.out.print("CFB CURSOS\n");

    System.out.println("Curso de Java");

    System.out.printf("Canal:%s - Ano:%d\n", "CFB Cursos", 2021);

    // %n e \n são iguais, os dois quebram linhas
    System.out.printf("Texto:%s%nAno:%d%n", "Olá", 2024);

    System.out.printf("Valor da variável num:%d %nNome:%s\n", num, nome);

    int n1=10, n2=20, n3=30;
    int res = n1+n2+n3;

    System.out.printf("Resultado da soma: %d", res);
  }
}
