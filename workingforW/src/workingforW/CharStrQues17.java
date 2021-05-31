package workingforW;

import java.util.Scanner;

public class CharStrQues17 {
	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		System.out.print("Enter a name: ");
		String input = console.nextLine();
		String[] data = input.split("\\s+");
		String res = "";
		for (int i = data.length-1; i >= 0; i--) {
			res += data[i] + " ";
		}
		System.out.println(res);
		console.close();
	}
}
