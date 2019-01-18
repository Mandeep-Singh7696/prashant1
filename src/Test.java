import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Test {

  public static void main(String[] args) throws IOException {
//    InputStreamReader ir = new InputStreamReader(System.in);
//    BufferedReader br = new BufferedReader(ir);
//    for (int i = 0; i <10 ; i++) {
//      int val = Integer.parseInt(br.readLine());
//      System.out.println(val);
//    }
    //int val = Integer.parseInt(br.readLine());
    //System.out.println(val);
String s[] = {"aaa","bbb","ccc","ddd"};
    Random obj = new Random();
    int r =obj.nextInt(4);
    System.out.println(r);

    System.out.println(s[r]);

  }
}
