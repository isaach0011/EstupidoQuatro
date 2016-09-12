package estupido.controller;

import java.util.Scanner;

public class EstupidoController
{
	private String myName;
	private Scanner readKeyboardInput;
	
	public EstupidoController()
	{
		myName = "Isaac Hill";
		readKeyboardInput = new Scanner(System.in);
	}
	
	public void start()
	{
		System.out.println("This is slightly less stupid :D");
		System.out.println(myName);
		askQuestions();
	}
	
	private void askQuestions()
	{
		System.out.println("What is your name?");
		String userInput = readKeyboardInput.nextLine();
		System.out.println("You said " + userInput + ".");
		
		System.out.println("How old are you?");
		int intInput = readKeyboardInput.nextInt();
		System.out.println("You said " + intInput + ".");
		readKeyboardInput.nextLine(); 
		
		System.out.println("What are the first six digits of pi?");
		double doubleInput = readKeyboardInput.nextDouble();
		System.out.println("The correct answer is 3.14159. You said " + doubleInput + ".");
		
		System.out.println("If you could describe me in 1 word what would it be?");
		String nextInput = readKeyboardInput.next();
		System.out.println("You said " + nextInput + ". Thanks!!");
		readKeyboardInput.nextLine(); // Used to consume the remainder of the text buffer
		
		System.out.println("Can you type a sentance about how cool I am?");
		String storyInput = readKeyboardInput.nextLine();
		System.out.println("Your sentance was wonderful. It said " + storyInput);
		
		System.out.println("What state are you living in?");
		String stateInput = readKeyboardInput.nextLine();
		System.out.println("You said " + stateInput  +". That's a pretty cool state.");
		
		System.out.println("On a scale of 1-10, how bored are you?");
		int boredInput = readKeyboardInput.nextInt();
		System.out.println("You said " + boredInput);
		readKeyboardInput.nextLine();
		
		System.out.println("What is your favorite food?");
		String foodInput = readKeyboardInput.nextLine();
		System.out.println("You said " + foodInput + ". That is a pretty good food.");  
		
		System.out.println("What is your favorite color?");
		String colorInput = readKeyboardInput.nextLine();
		System.out.println("You said " + colorInput + ". I like that color too.");
		
		System.out.println("Do you think Duncan is cool?");
		String coolInput = readKeyboardInput.nextLine();
		if(coolInput.equalsIgnoreCase("Yes"))
			{
				System.out.println("You seem to be very well informed.");
			}
		if(coolInput.equalsIgnoreCase("No"))
			{
				System.out.println("You are lame and a meanie.");
			}
		
		System.out.println("Goodbye.");
	}
}
