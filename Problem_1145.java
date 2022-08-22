import java.io.IOException;
import java.util.Scanner;

public class Problem_1145 {
 
    public static void main(String[] args) throws IOException {
      Scanner entrada = new Scanner(System.in);

      int linha = entrada.nextInt();
      int contagem = entrada.nextInt();
      int cont = 1;

      while(cont <= contagem){
        System.out.print(cont);
        if(cont%linha == 0){
          System.out.println("");
        } else {
          System.out.print(" ");
        }
        cont = cont + 1;
      }

      entrada.close();
    }
 
}