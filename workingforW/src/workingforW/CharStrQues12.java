package workingforW;

import java.util.Scanner;

public class CharStrQues12 {
	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		System.out.print("Enter an Integer: ");
		String[] numbers = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		int num = console.nextInt();
		String binary = toBinary(num);
		String eng = "";
		while (num != 0) {
			int digit = num%10;
			eng = numbers[digit] + " " + eng;
			num /= 10;
		}
		System.out.println(binary);
		System.out.println(eng);
	}
	public static String toBinary(int n) {
		if (n == 0) {
			return "";
		}
		int remain = n % 2;
		return toBinary(n/2) + remain;
	}
}
