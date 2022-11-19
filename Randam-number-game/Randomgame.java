import java.util.Scanner;
import java.util.Random;
import static java.lang.System.out;

public class Randomgame {
    public static void main(String[] args) {
        out.println("Hey!, Welcom to the Game of Guessing\n\n\t");
        out.println("One number in my mind if you guess it right you'r win or you loss,\n\n\t Aru you ready \n\n");
        out.println("Enter the number in my mind. It is between 1 to 10");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int mynum = new Random().nextInt(10)+1;
        
        if(num == mynum){
            out.println("Wow! You'r Right ");
          }else{
            out.println("Oh! Sorry :( better luck next Time");
            out.println("\n\n\tIt is : " + mynum);
          }

    }
}