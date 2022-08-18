import java.io.IOException;
import java.util.Scanner;

public class Problem_1114 {
 
    public static void main(String[] args) throws IOException {
      Scanner entrada = new Scanner(System.in);
      boolean verificador = false;

      while(verificador == false){
        int senha = entrada.nextInt();
        if(senha != 2002){
          System.out.println("Senha Invalida");
        } else if (senha == 2002){
          System.out.println("Acesso Permitido");
          verificador = true;
        }
      }

      entrada.close();
    }
 
}