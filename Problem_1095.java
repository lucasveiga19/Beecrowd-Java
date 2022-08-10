import java.io.IOException;

public class Problem_1095 {
 
    public static void main(String[] args) throws IOException {

      int cont = 60;
      int i = 1;
      int j = 60;
      
      while(cont>-5){
        System.out.println("I="+i+" J="+j);

        i = i + 3;
        j = j - 5;
        cont = cont - 5;
      }
      
    }
 
}