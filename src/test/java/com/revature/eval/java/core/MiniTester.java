package com.revature.eval.java.core;

public class MiniTester {

	public static void main(String[] args) {
		System.out.println(reverse("I'm hungry!"));
		System.out.println(reverse("Robot, ramen ramadan"));
		System.out.println(acronym("GMU Image Manipulator Processor"));
		System.out.println(acronym("Complementary metal-oxide semiconductor"));
		//System.out.println(getScrabbleScore("cabbage"));
	}
	
	public static String reverse(String string) {
		if (string == "") {
			return("");
		}
		
		else {
			int counter = 0;
			char[] mychararray = new char[string.length()];
			for (int i = string.length()-1; i >= 0; i--) {
				mychararray[counter] = string.charAt(i); 
				counter++;
			}
			String backwardsstring = new String(mychararray);
			return backwardsstring;
		}
	}
	
	public static String acronym(String phrase) {

		String[] wordsonly = phrase.split(" |-");
		char[] myacronym = new char[wordsonly.length];
		for (int i = 0; i < wordsonly.length; i++) {
			String thiswordhere = new String(wordsonly[i]);
			char whatiwant = thiswordhere.charAt(0);
			for (int j = 0; j < myacronym.length; j++) {
				myacronym[i] = whatiwant;
			}
		}
		String finalproduct = new String(myacronym);
		String superfinalproduct = new String(finalproduct.toUpperCase());
		return superfinalproduct;
	}

/**	public static int getScrabbleScore(String string) {
		int mylength = string.length();		
		int myscore = 0;
		String mystring = new String(string.toUpperCase());
		for (int i = 0; i < mylength; i++) {
			
			char mycharacter = mystring.charAt(i);

			if (Character.compare(mycharacter,('A' | 'E' | 'I' | 'O' | 'U' | 'L' | 'N' | 'R' | 'S' | 'T')) == true); {
				myscore = myscore + 1;
			}
			if (mycharacter == ('D' | 'G')) {
				myscore = myscore + 2;
			}
			if (mycharacter == ('B' | 'C' | 'M' | 'P') ) {
				myscore = myscore + 3;
			}
			if (mycharacter == ('F' | 'H' | 'V' | 'W' | 'Y')) {
				myscore = myscore + 4;	
			}
			if (mycharacter == 'K') {
				myscore = myscore + 5;
			}
			if (mycharacter == ('J' | 'X') ) {
				myscore = myscore + 8;
			}
			if (mycharacter == ('Q' | 'Z')) {
				myscore = myscore + 10;
			}
			else {
				System.out.println("if you got here you FUCKED up");
			}
		}
	return myscore;
	}**/
}

