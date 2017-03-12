package com.ken.java.exercise;

import java.util.HashMap;
import java.util.Scanner;

public class wordifyToThousand {
	public static void wordify()
	{
		Scanner scan = new Scanner(System.in);
		
		int input,thousand, hundred, ten, one;
		String wordify = "";
		
		HashMap<Integer,String> ordinalTens = new HashMap<Integer, String>();

		ordinalTens.put(1, "ten ");
		ordinalTens.put(11, "eleven ");
		ordinalTens.put(12, "twelve ");
		ordinalTens.put(13, "thirteen ");
		ordinalTens.put(14, "fourteen ");
		ordinalTens.put(15, "fifteen ");
		ordinalTens.put(16, "sixteen ");
		ordinalTens.put(17, "seventeen ");
		ordinalTens.put(18, "eighteen ");
		ordinalTens.put(19, "nineteen ");
		ordinalTens.put(2, "twenty ");
		ordinalTens.put(3, "thirty ");
		ordinalTens.put(4, "fourty ");
		ordinalTens.put(5, "fifty ");
		ordinalTens.put(6, "sixty ");
		ordinalTens.put(7, "seventy ");
		ordinalTens.put(8, "eighty ");
		ordinalTens.put(9, "ninety ");
		
		HashMap<Integer,String> ordinalOnes = new HashMap<Integer, String>();
		ordinalOnes.put(1, "one");
		ordinalOnes.put(2, "two");
		ordinalOnes.put(3, "three");
		ordinalOnes.put(4, "four");
		ordinalOnes.put(5, "five");
		ordinalOnes.put(6, "six");
		ordinalOnes.put(7, "seven");
		ordinalOnes.put(8, "eight");
		ordinalOnes.put(9, "nine");
		
		HashMap<Integer,String> ordinalHundredths = new HashMap<Integer, String>();
		ordinalHundredths.put(1, "one hundred ");
		ordinalHundredths.put(2, "two hundred ");
		ordinalHundredths.put(3, "three hundred ");
		ordinalHundredths.put(4, "four hundred ");
		ordinalHundredths.put(5, "five hundred ");
		ordinalHundredths.put(6, "six hundred ");
		ordinalHundredths.put(7, "seven hundred ");
		ordinalHundredths.put(8, "eight hundred ");
		ordinalHundredths.put(9, "nine hundred ");
		
		HashMap<Integer,String> ordinalThousandths = new HashMap<Integer, String>();
		ordinalThousandths.put(1, "one thousand ");
		ordinalThousandths.put(2, "two thousand ");
		ordinalThousandths.put(3, "three thousand ");
		ordinalThousandths.put(4, "four thousand ");
		ordinalThousandths.put(5, "five thousand ");
		ordinalThousandths.put(6, "six thousand ");
		ordinalThousandths.put(7, "seven thousand ");
		ordinalThousandths.put(8, "eight thousand ");
		ordinalThousandths.put(9, "nine thousand ");
		
		HashMap<Integer,String> ordinalTenThousandths = new HashMap<Integer, String>();
		ordinalTenThousandths.put(1, "ten ");
		ordinalTenThousandths.put(2, "twenty ");
		ordinalTenThousandths.put(3, "thirty ");
		ordinalTenThousandths.put(4, "fourty ");
		ordinalTenThousandths.put(5, "fifty ");
		ordinalTenThousandths.put(6, "sixty ");
		ordinalTenThousandths.put(7, "seventy ");
		ordinalTenThousandths.put(8, "eighty ");
		ordinalTenThousandths.put(9, "ninety  ");
		
		HashMap<Integer,String> ordinalHundredThousandths = new HashMap<Integer, String>();
		ordinalHundredThousandths.put(1, "one hundred ");
		ordinalHundredThousandths.put(2, "two hundred ");
		ordinalHundredThousandths.put(3, "three hundred ");
		ordinalHundredThousandths.put(4, "four hundred ");
		ordinalHundredThousandths.put(5, "five hundred ");
		ordinalHundredThousandths.put(6, "six hundred ");
		ordinalHundredThousandths.put(7, "seven hundred ");
		ordinalHundredThousandths.put(8, "eight hundred ");
		ordinalHundredThousandths.put(9, "nine hundred ");
		
		
		input = scan.nextInt();
		String s = String.valueOf(input);
		int len = s.length();
		int stat;
		hundred = input %1000;
		 ten = input %100;
		 one = input %10;

			stat = input%10;
			input/=10;
			wordify= ordinalOnes.get(stat) + wordify;
			if(input == 0){ System.out.println(wordify); return;}
			stat = input%10;
			input/=10;
			wordify= ordinalTens.get(stat) + wordify;
			if(input == 0){ System.out.println(wordify); return;}
			stat = input%10;
			input/=10;
			wordify=ordinalHundredths.get(stat) + wordify;
			if(input == 0){ System.out.println(wordify); return;}
			stat = input%10;
			input/=10;
			wordify=ordinalThousandths.get(stat) + wordify;
			if(input == 0){ System.out.println(wordify); return;}
			stat = input%10;
			input/=10;
			wordify=ordinalTenThousandths.get(stat) + wordify;
			if(input == 0){ System.out.println(wordify); return;}
			stat = input%10;
			input/=10;
			wordify=ordinalHundredThousandths.get(stat) + wordify;
			if(input == 0){ System.out.println(wordify); return;}
		
		System.out.println(wordify);
	}
}
