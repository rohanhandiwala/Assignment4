package assignment4;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class Combination {
	public static void main(String[] args) {
		Random ran = new Random();
		int secretNumber = ran.nextInt(1000);
		//int secretNumber = 235;
		//System.out.println("The secret number is :" + secretNumber);
		int numGuesses= 0;
		int guess = 0;
		
		int guess1 = -1;
		int guess2 = -1;
		int guess3 = -1;
		

		
		
		while(guess != secretNumber) {
			
			System.out.print("Please enter your guess: ");
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			
			try {
				
				guess = Integer.parseInt(line);
				
			}
			
			
			catch(NumberFormatException ex) {
				System.out.println("That's not a number !");
				continue;
			}
			catch(InputMismatchException e) {
				System.out.println("That's not a number !");
				continue;
			}
			catch(Exception ex) {
				System.out.println("generic exception");
				System.out.println(ex.toString());
				continue;
			}
			
			if (guess < 100) {
				System.out.println("Guess must be 3 digits. ");
			}
			else  if (guess > 999) {
				System.out.println("Guess must be 3 digits. ");
			}
			else if (guess < 0) {
				System.out.println("You must enter a positive number. ");
			}
			
			
			
			else {
				
			
			numGuesses++;
			
			guess3 = guess %10;
			
			guess2 = (guess/10) %10;
			
			guess1 = (guess/100) %10;
			
		
			
			if(secretNumber==guess) {
				System.out.println("Congratulations! You guessed correct! :) ");
				break;
			}else{
				if(guess1 == ((secretNumber/100) %10)){
					System.out.println("The first digit is correct!");
				}else if (guess1 > ((secretNumber/100) %10)){
					
					System.out.println("The first digit is too high!");
				}else {
					System.out.println("The first digit is too low!");
				}
				
				if(guess2 == ((secretNumber/10) %10)){
					System.out.println("The second digit is correct!");
				}else if (guess2 > ((secretNumber/10) %10)){
					
					System.out.println("The second digit is too high!");
				}else {
					System.out.println("The second digit is too low!");
				}
				
				if(guess3 == (secretNumber %10)){
					System.out.println("The third digit is correct!");
				}else if (guess3 > (secretNumber %10)){
					
					System.out.println("The third digit is too high!");
				}else {
					System.out.println("The third digit is too low!");
				}
			}
		}
		}
		if (numGuesses == 1) {
			System.out.println("It took you " + numGuesses + " guess to find the secret number.");
		}
		else {
		System.out.println("It took you " + numGuesses + " guesses to find the secret number.");
	}
	}
}