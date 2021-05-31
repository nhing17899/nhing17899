package workingforW;
import java.util.Scanner;

public class CharStrQues7 {
	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		System.out.print("Enter a String: ");
		String input = console.nextLine();
		input = removeNguyenAm(input);
		System.out.println(input);
	}
	public static String removeNguyenAm(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 65 || c == 69 || c == 73 || c == 79 || c == 85 || c == 97 || c == 101 || c == 105 || c == 111 || c == 117) {
				continue;
			}
			res += c;
		}
		return res;
	}
	
}
