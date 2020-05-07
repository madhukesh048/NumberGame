import java.util.Scanner;

public class NumberGame {
    public static void main(String [] args){
        int randomNumber = (int) (Math.random() * 100) + 1;
        boolean hasWon = false;
        System.out.println("I have selected a Random Number between 1 and 100");
        System.out.println("Try to guess it!");
        Scanner scanner = new Scanner(System.in);
        for( int i = 10;i > 0;i--){
            System.out.println("You have "+ i + " guesses left. Choose again!");
            int guess = scanner.nextInt();
            System.out.println("Your Guess was "+ guess);

            if(randomNumber < guess){
                System.out.println("Its smaller than " + guess);
            }
            else if(randomNumber > guess){
                System.out.println("Its greater than " + guess);
            }
            else{
                hasWon = true;
                break;
            }
        }
        if(hasWon){
            System.out.println("Yayy!! You guessed it right!");
        }else {
            System.out.println("Game over. You lose!!");
            System.out.println("The Random Number was: " + randomNumber );
        }
    }
}
