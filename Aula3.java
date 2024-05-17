public class Aula3 {
  // COMANDOS DE DECISÃO
  public static void main(String[] args) {

    int nota = 85;
    int media = 60;
    int faltas = 10;
    int maxFaltas = 5;

    // Ternário
    String res;
    int res2;

    res = (nota >= media ? "Aprovado\n" : "Reprovado\n");
    System.out.println("\nResultado: " + res);

    res2 = (nota >= media ? 1 : 0);
    System.out.println("\nResultado: " + (res2 == 1 ? "Aprovado\n" : "Reprovado\n"));

    if(nota >= media && faltas <= maxFaltas) {
      System.out.println("Aprovado");
    } else if(nota >= 40) {
      System.out.println("Recuperação");
    } else {
      System.out.println("Reprovado");
    }

    System.out.println("Fim do programa\n");

    int pos = 4;

    switch(pos) {
      case 1:
        System.out.println("Primeiro lugar!");
        break;
      case 2:
        System.out.println("Segundo lugar!");
        break;
      case 3:
        System.out.println("Terceiro lugar!");
        break;
      case 4:
        System.out.println("Menção honrosa!");
        break;
      case 5:
        System.out.println("Menção honrosa!");
        break;
      case 6:
        System.out.println("Menção honrosa!");
        break;
      default:
        System.out.println("Não subiu no pódio!");
        break;

    }



  }
  





}