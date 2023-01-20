package sg.edu.nus.iss;

import java.util.Random;
import java.util.Scanner;

public class App2 {
    private App2() {
}

    public static void main(String[] args) {
        Random rand = new Random();
        Integer guessNumber = rand.nextInt(100);

        Integer myGuess = 0;

        Scanner input = new Scanner(System.in);
        while (myGuess != guessNumber) {
            myGuess = input.nextInt();

            if (myGuess < guessNumber) {
                System.out.println("Higher");

            } else if (myGuess > guessNumber){
                System.out.println("Lower");

            } else {
                System.out.println("Correct");
                input.close();
                System.exit(0);
            } 
        }
    }


}
    

