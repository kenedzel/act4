package com.ken.java.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Activity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		convertToRomanNumerals();
	}
	
	public static void loginPassword()
	{
		Scanner scan = new Scanner(System.in);
		String password,
		stringPass = "password";
		int loginTries = 0;
		
		do
		{
			System.out.println("Input a password: ");
			password = scan.nextLine();
			
			password = password.trim();
			
			if(stringPass.equals(password))
			{
				System.out.println("You've entered a correct password.");
				break;
			}
			else
			{
				System.out.println("You've entered a wrong password.");
			}
			loginTries++;
		} while(loginTries < 3);
		
		if(loginTries >= 3)
		{
			System.out.println("Sorry, you've reached the limit of login trials.");
		}
		else
		{
			System.out.println("Welcome!");
		}
	}

	
	public static void countNonAndVowels()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String input = scan.nextLine();

		int ctrConsonants = 0, 
				ctrVowel = 0;
		
		int inputLen = input.length();
			for(int x = 0 ; x <inputLen ; x++)
			{
				String strVal = String.valueOf(input.charAt(x));
				if(input.charAt(x) == 'A' || input.charAt(x) ==  'a' || input.charAt(x) == 'E' || input.charAt(x) == 'e' || input.charAt(x) ==  'I' || input.charAt(x) == 'i' || input.charAt(x) == 'O' || input.charAt(x) == 'o' || input.charAt(x) == 'U' || input.charAt(x) == 'u')
				{
					ctrVowel++;
				}
				else
				{
					ctrConsonants++;
				}
			}
			
			System.out.println("There are " + ctrVowel + " Vowels in the word " + input);
			System.out.println("There are " + ctrConsonants + " Consonants in the word " + input);
			
		}
	
	public static void splitAndIdentifyInputs()
	{
		// split assign prioritize vowels
		System.out.println("user input: ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		input = input.replaceAll("\\s", "");
		
		String[] severedInput = input.split(",");
		

		for(int i = 0 ; i < severedInput.length ; i++)
		{
			if(severedInput[i].startsWith("a") || severedInput[i].startsWith("A") || 
				severedInput[i].startsWith("e") || severedInput[i].startsWith("E") || 
				severedInput[i].startsWith("i") || severedInput[i].startsWith("I") || 
				severedInput[i].startsWith("o") || severedInput[i].startsWith("O") || 
				severedInput[i].startsWith("u") || severedInput[i].startsWith("U")
				)
			{
				System.out.println(severedInput[i]);
			}
		}
		
		for(int q = 0 ; q < severedInput.length ; q++)
		{
			if(!(severedInput[q].startsWith("a") || severedInput[q].startsWith("A") || 
				severedInput[q].startsWith("e") || severedInput[q].startsWith("E") || 
				severedInput[q].startsWith("i") || severedInput[q].startsWith("I") || 
				severedInput[q].startsWith("o") || severedInput[q].startsWith("O") || 
				severedInput[q].startsWith("u") || severedInput[q].startsWith("U")
				))
			{
				System.out.println(severedInput[q]);
			}
		}

	}
	
	//FIZZ FOR 3 BUZZ FOR 5
	public static void fizzBuzz()
	{
		int len = 100;
		
		for(int x = 1 ; x <= len ; x++)
		{
			if(x%3==0 && x%5==0)
			{
				System.out.println("FIZZBUZZ ");
			}
			else if (x%5 == 0)
			{
				System.out.println("BUZZ ");
			}
			else if(x%3 == 0)
			{
				System.out.println("FIZZ");
			}
			else
			{
				System.out.println(x);
			}
		}
		
	}
	
	//guessing game make an app think of a number then accept input to guess what it is
	public static void guessingGame()
	{
		Scanner s = new Scanner(System.in);
		
		int input, 
		randomNumber, 
		tries = 1,
		triesLimit = 3;
		
		Random rnd = new Random();
		
		randomNumber = rnd.nextInt(10);
		
		
		
		do{
			System.out.println("Guess a number from 1 to 10: ");
			input = s.nextInt();
			if(input == randomNumber)
			{
				System.out.println("Congratulations! You've guessed the right number: " + randomNumber);
				break;
			}
			else
			{
				if(tries == triesLimit)
				{
					System.out.println("Sorry, you've reached the limit. Better Luck next time.");
					break;
				}
				else{
					System.out.println("Please try again: ");
				}
				
			}
			tries++;
		} while(tries <= triesLimit);
	}
	
	//dice doubles app that endlessly rolls 6 sided dice then stop once they both match
	public static void diceDoubles()
	{
		Random rndDice = new Random();
		int dice1,
			dice2;
	
		do{
			
			dice1 = rndDice.nextInt(6) + 1;
			dice2 = rndDice.nextInt(6) + 1;
			System.out.println(dice1 + "    " + dice2);
		}while(dice1 != dice2);
		
	}
/*
			*****
			 ***
			  *
 * */
	
	public static void downwardPattern()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number of rows: ");
		int input = scan.nextInt();
		
		int a = 3, p = 0;
		
		for(int z = input; z>0; z--)
		{
			for(int x = z; x < input; x++)
			{
				System.out.print(" ");

			}
			for(int y = 0 + p ; y < input + (z - 1) ; y++)
			{
				System.out.print("*");
			}
			p++;
			System.out.println();
		}
	}
	/* 
 
	 * 
	 **
	 *** 
	 ** 
	 *

			  
 */
	public static void rightPattern()
	{
		Scanner scan = new Scanner(System.in);
		int input;
		System.out.println("Input a range: ");
		input = scan.nextInt();
		
		if(input%2 != 0)
		{
			int cc = 0, c = 2;
			while(c > 0)
			{
				if(cc == 0)
				{
					
					for(int h = 1; h <= input ; h++)
					{
						for(int j = 1; j<=h ; j++)
						{
							System.out.print("*");
						}
						System.out.println();
					}
					cc++;
				}
				else
				{
					for(int i = 1,h = input-1 ; i<=input - 1; i++, h--)
					{
						for(int k = 1; k<=h;k++)
						{
							System.out.print("*");
						}
						System.out.println();
					}
				}
				c--;
			}
		}
		else
		{
			System.out.println("Invalid input. Please enter an odd number.");
		}
		
			
	}
	
	//roman
	public static void convertToRomanNumerals()
	{
		Scanner scan = new Scanner(System.in);
		String romanNumeral = "";
		int input = scan.nextInt();
		
		while(input >= 1000)
		{
			romanNumeral+= "M";
			input-=1000;
		}
		while(input >= 500)
		{
			romanNumeral+= "D";
			input-=500;
		}
		while(input >= 100)
		{
			romanNumeral+= "C";
			input-=100;
		}
		while(input >= 50)
		{
			romanNumeral+="L";
			input-=50;
		}
		while(input >= 10)
		{
			romanNumeral+="X";
		}
		while(input>= 5)
		{
			romanNumeral+="V";
			input-=5;
		}
		while(input>= 1)
		{
			romanNumeral+="I";
			input-=1;
		}
		System.out.println(romanNumeral);
	}
	
	public static void getTenIntegers()
	{
		Scanner scan = new Scanner(System.in);
		
		int[] inputs = new int[10];
		
		int inputLength = inputs.length;
		for(int x = 0; x<10 ; x++)
		{
			System.out.println("Enter number["+ x +"]: ");
			inputs[x] = scan.nextInt();
		}
		
		
	}
	
	public static void get1000integers()
	{
		int[] arrInt = new int[1000];
		
		Random rnd = new Random();
		
		int arrIntLen = arrInt.length;
		
		for(int x = 0; x<1000;x++)
		{
			arrInt[x] = rnd.nextInt(99);
			while(arrInt[x] < 10)
			{
				arrInt[x] = rnd.nextInt(99);
			}
		}
		
	}
	
	public static void reverseArray()
	{
		
		int arr[] = new int[10],
				arrTwo[] = new int[10];
		
		int arrLen = arr.length,
				temp = 0;
		Random rnd = new Random();
		System.out.println("in order:");
		for(int x = 0 ; x < arrLen ; x++)
		{
			arr[x] = rnd.nextInt(99);
			System.out.println(arr[x]);
		}
		
		System.out.println("Reversed");
		for (int x = 0 ; x <= arrLen / 2 ; x++)
		{
			temp = arr[x];
			arr[x] = arr[arrLen - 1 - x];
			arr[arrLen -1 - x] = temp;
			
		}

		for (int y = 0 ; y <= arrLen - 1 ; y++)
		{
			System.out.println(arr[y]);
		}
		
	}
}
