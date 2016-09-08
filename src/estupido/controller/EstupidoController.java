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
	}
}
