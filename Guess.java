import java.util.Random;//used for taking any random number
import java.util.Scanner;//used for taking user input

public class Guess{
    public static void main(String []arg)
    {
        Random random = new Random();
        int targetNumber = random.nextInt(100)+1; //It generate a random number between 1 to 100
        int attempt = 0;
        System.out.println("Welcome to the Number Guess Game");
        System.out.println("I'm thinking of a number between 1 to 100");

        Scanner sc = new Scanner(System.in);//for taking user input
        int guess;

        do{
            System.out.print("Take a Guess:");
            guess = sc.nextInt();
            attempt++;

            if(guess < targetNumber)
            {
                System.out.println("Too low");
            }
            else if(guess > targetNumber){
                System.out.println("Too High");
            }
            else{
                System.out.println("Congratulations! you guessed the number in " + attempt + " attempt");
            }
        }while(guess != targetNumber);
    sc.close();
    }
}