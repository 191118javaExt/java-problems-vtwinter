package com.revature.eval.java.core;

public class MiniTester {

	public static void main(String[] args) {
		System.out.println(reverse("I'm hungry!"));
		System.out.println(reverse("Robot, ramen ramadan"));
		System.out.println(acronym("GMU Image Manipulator Processor"));
		System.out.println(acronym("Complementary metal-oxide semiconductor"));
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

}
