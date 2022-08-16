import java.io.IOException;

public class Problem_1096 {
 
    public static void main(String[] args) throws IOException {

      int i = 1;
      int j = 7;
      
      while(i<10){
        while (j>4) {
          System.out.println("I="+i+" J="+j);
          j = j-1;
        }
      i = i+2;
      j = 7;
      
      }

    }
 
}