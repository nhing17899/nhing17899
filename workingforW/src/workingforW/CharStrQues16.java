package workingforW;

import java.util.Scanner;

public class CharStrQues16 {
	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		System.out.print("Enter a name: ");
		String input = console.nextLine();
		String[] data = input.split("\\s+");
		String res = data[data.length-1];
		for (int i = 0; i < data.length-1; i++) {
			res += " " + data[i];
		}
		System.out.println(res);
		console.close();
	}
}
