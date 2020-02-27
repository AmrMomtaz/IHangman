package IHangmanPackage;
import java.util.Scanner;

public class UI 
{
	public static void main(String[] args) 
	{
		Game game = new Game();
		System.out.println("Welcome To Hangman game (Countries Edition)\n");
		Scanner input = new Scanner (System.in);
		System.out.println("Please Enter the number of maximum trials :");
		game.setMaxWrongGuesses(input.nextInt());
		while(!game.win)
		{
			System.out.println("The word is "+new String(game.Apparent_Word)
					+" // You Have got "+ (game.maximum-game.count) +" Trials"
					+ " // Please Enter The Character :");
			game.play(input.next().charAt(0));
		}
		input.close();
		System.out.println("\n\nCongratulations You Won !!!");
	}
}
