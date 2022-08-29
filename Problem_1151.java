import java.io.IOException;
import java.util.Scanner;

public class Problem_1151 {
 
    public static void main(String[] args) throws IOException {
      Scanner entrada = new Scanner(System.in);

      int a = 0;
      int b = 1;
      int fibonacci = 1;

      int cont = entrada.nextInt();

      if(cont == 1){
        System.out.print(a);
      } else if (cont >= 2){
        System.out.print(a+" "+b);
      }
      
      for(int i=3; i<=cont; i++){
        System.out.print(" "+fibonacci);
        a = b;
        b = fibonacci;
        fibonacci = a + b;
      }

      System.out.println();
      entrada.close();
    }
 
}