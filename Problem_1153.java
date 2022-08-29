import java.io.IOException;
import java.util.Scanner;

public class Problem_1153 {
 
    public static void main(String[] args) throws IOException {
      Scanner entrada = new Scanner(System.in);

      int fatorando = entrada.nextInt();
      int fatorial = 1;

      for(int i=0; i<fatorando; i++){
        fatorial = fatorial * (fatorando-i);
      }

      System.out.println(fatorial);
      entrada.close();
    }
 
}