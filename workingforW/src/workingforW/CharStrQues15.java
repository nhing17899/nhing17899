package workingforW;

import java.util.Scanner;

public class CharStrQues15 {
	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		System.out.print("Enter a String: ");
		String input = console.nextLine();
		String[] data = input.split("\\s+");
		String res = "";
		int sum = 0;
		for (String s : data) {
			res = reverseStr(s) + " " + res;
			sum += s.length();
		}
		System.out.println(sum + "\n" + res);
		console.close();
	}
	
	public static String reverseStr(String s) {
		String res = "";
		for (int i = s.length()-1; i >= 0; i--) {
			res += s.charAt(i);
		}
		return res;
	}
}
