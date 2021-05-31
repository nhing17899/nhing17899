package workingforW;

import java.util.*;
public class CharStrQues6 {
	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		System.out.print("Enter a String: ");
		String input = console.nextLine();
		input = input.trim();
		String[] data = input.split(" ");
		String res = "";
		for (String s : data) {
			boolean firstLetter = true;
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (Character.isLetter(c)) {
					if (firstLetter) {
						if (Character.isUpperCase(c)) {
							res += c;
						}
						else {
							res += Character.toUpperCase(c);
						}
						firstLetter = false;
					}
					else {
						res += c;
					}
				}
			}
			res += " ";
		}
		console.close();
		System.out.println(res);
	}
	
}
