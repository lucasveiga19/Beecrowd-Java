import java.io.IOException;
import java.util.Scanner;

public class Problem_1004 {
 
    public static void main(String[] args) throws IOException {

      Scanner entrada = new Scanner(System.in);

      int A = entrada.nextInt();
      int B = entrada.nextInt();

      int resultado = A * B;

      System.out.println("PROD = "+resultado);
    }
 
}