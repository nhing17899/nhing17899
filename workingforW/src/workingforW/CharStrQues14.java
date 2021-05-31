package workingforW;

import java.util.Scanner;

public class CharStrQues14 {
	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		System.out.print("Enter a String: ");
		String input = console.nextLine();
		String[] data = input.split("\\s+");
		double floatSum = 0;
		int intSum = 0;
		String strSum = "";
		for (String s : data) {
			if (!isNumeric(s)) {
				strSum += s + " ";
			}
			else {
				if (!isFloat(s)) {
					intSum += Integer.parseInt(s);
				}
				else {
					floatSum += Float.parseFloat(s);
				}
			}
		}
		System.out.println("the sum of integer numbers: " + intSum);
		System.out.println("the sum of float numbers: " + floatSum);
		System.out.println("the sum of strings: " + strSum);
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
	
	public static boolean isFloat(String num) {
		for (int i = 0; i < num.length(); i++) {
			char c = num.charAt(i);
			if (c == '.') {
				return true;
			}
		}
		return false;
	}
}
