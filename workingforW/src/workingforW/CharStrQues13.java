package workingforW;

import java.util.Scanner;

public class CharStrQues13 {
	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		System.out.print("Enter a String of numbers: ");
		String input = console.nextLine();
		String[] data = input.split("\\s+");
		if (!isValid(data)) {
			System.out.print("invalid string\nN/A");
		}
		else {
			double answer = 0;
			for (String num : data) {
				if (isDouble(num)) {
					answer += Double.parseDouble(num)*Double.parseDouble(num);
				}
				else {
					answer += Integer.parseInt(num)*Integer.parseInt(num);
				}
			}
			System.out.println("valid string");
			System.out.print("square sum: " + answer);
		}
		console.close();
		
	}
	public static boolean isNumeric(String s) {
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!Character.isDigit(c) && c != '.') {
				return false;
			}
		}
		return true;
	}
	public static boolean isValid(String[] arr) {
		for (String s : arr) {
			if (!isNumeric(s)) {
				return false;
			}
		}
		return true;
	}
	public static boolean isDouble(String num) {
		for (int i = 0; i < num.length(); i++) {
			char c = num.charAt(i);
			if (c == '.') {
				return true;
			}
		}
		return false;
	}
}
