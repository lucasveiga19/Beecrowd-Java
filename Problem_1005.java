import java.io.IOException;
import java.util.Scanner;

public class Problem_1005 {
 
    public static void main(String[] args) throws IOException {
      Scanner entrada = new Scanner(System.in);
        
      double a = entrada.nextDouble();
      double b = entrada.nextDouble();
      double media = ((3.5 * a) + (7.5 * b))/11;
      
      System.out.println(String.format("MEDIA = %.5f" , media));
    }
 
}