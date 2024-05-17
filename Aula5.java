import java.util.Scanner;

public class Aula5 {
  // LOOPING
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    /*
    // FOR → Utilizar quando SOUBER quantas vezes o comando será usado.
    // cont = cont + 1
    // cont += 1
    // cont ++

    for(int cont = 0 ; cont < 5 ; cont ++) {
      System.out.println(cont + " - CFB Cursos");
    }
    System.out.println("Fim do programa\n");

    //INVERSO

    for(int cont = 5 ; cont > 0 ; cont --) {
      System.out.println(cont + " - CFB Cursos");
    }
    System.out.println("Fim do programa\n");
    */

    /* 
    int max = scan.nextInt();
    // WHILE → Utilizar quando NÃO SOUBER quantas vezes o comando será usado.
    
    int cont = 0; // Passo 1 - Declarar fora do While
    while(cont < max) { // Passo 2 - Condição no While
      System.out.println(cont + " - CFB Cursos");
      cont ++; // Passo 3 - Imcremento dentro do While
    }
    System.out.println("Fim do programa\n");
    */

    // DO WHILE → Primeiro faz depois testa
    int cont = 0;
    do {
      System.out.println(cont + " - CFB Cursos");
      cont ++;
    } while (cont <= 0);

    System.out.println("Fim do programa\n");



  }
}
