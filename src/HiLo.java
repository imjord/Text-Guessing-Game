import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		// create a random number for the user to guess
		Scanner scan = new Scanner(System.in);
		String playAgain = "";
		do {
			int theNumber = (int)(Math.random() * 100 + 1);
			System.out.println(theNumber);
			int guess = 0;
			int numberOfTries = 0;
			while (guess != theNumber) {
				System.out.println("Guess a number between 1-100 please");
				guess = scan.nextInt();
				if (guess < theNumber) {
					numberOfTries = numberOfTries + 1;
					System.out.println("Your guess is to low try again! your guess [" + guess + "]");
				}
				else if (guess > theNumber) {
					numberOfTries = numberOfTries + 1;
					System.out.println("Your guess is to high try again! your guess[" + guess  +"]");
				}
				else
					System.out.println("Your guess is correct!! you win!!");
					
			}
			System.out.println("it only took you " + numberOfTries + " tries to win");
			System.out.println("Would you like to play again? (y/n)?");
			playAgain = scan.next();
		} while(playAgain.equalsIgnoreCase("y"));
		System.out.println("Hey thanks for trying out my game!");
		scan.close();




	}

}
