package workingforW;

import java.util.Scanner;

public class CharStrQues11 {
	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		System.out.print("Enter a String: ");
		int[] alphabet = new int[57];
		String input = console.nextLine();
		String[] data = input.split(" ");
		int count = 0;
		for (String word : data) {
			count++;
		}
		System.out.println("There are " + count + " words in the sentence.");
	}
}
