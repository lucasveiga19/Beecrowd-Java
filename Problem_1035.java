import java.io.IOException;
import java.util.Scanner;

public class Problem_1035 {
 
    public static void main(String[] args) throws IOException {
      Scanner entrada = new Scanner(System.in);

      int a = entrada.nextInt();
      int b = entrada.nextInt();
      int c = entrada.nextInt();
      int d = entrada.nextInt();

      if(b>c & d>a & (c+d)>(a+b) & c>0 & d>0 & a%2==0){
        System.out.println("Valores aceitos");
      } else {
        System.out.println("Valores nao aceitos");
      }
    }
 
}