package workingforW;

import java.util.Scanner;

public class CharStrQues10 {
	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		System.out.print("Enter a String: ");
		int[] alphabet = new int[57];
		String input = console.nextLine();
		String[] data = input.split(" ");
		for (String word : data) {
			for (int i = 0; i < word.length(); i++) {
				char c = word.charAt(i);
				int pos = c - 65;
				alphabet[pos] += 1;
			}
		}
		for (int j = 0; j < alphabet.length; j++) {
			if (alphabet[j] != 0) {
				char c = (char) (j+65);
				System.out.println(c + " appears " + alphabet[j] + " times.");
			}
		}
		console.close();
	}
}
