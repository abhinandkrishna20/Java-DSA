import static java.lang.System.out;
import java.util.Scanner;
public class First {
  public static void main(String[] args){
  out.println("This is the first program for I/O operations");
    Scanner input = new Scanner(System.in);
  out.println("Pls Enter your name ");
    String name = input.next();
    out.println("Welcom Mr/Mrs. " + name);
    
  }
}
