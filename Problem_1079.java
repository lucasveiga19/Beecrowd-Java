import java.io.IOException;
import java.util.Scanner;

public class Problem_1079 {
 
    public static void main(String[] args) throws IOException {
      Scanner entrada = new Scanner(System.in);

      int contador = entrada.nextInt();

      for(int i=0; i<contador; i++){
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();

        double media = ((a*2)+(b*3)+(c*5))/10;

        System.out.println(String.format("%.1f",media));
      }
    }
 
}