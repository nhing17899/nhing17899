package workingforW;

import java.util.*;

public class ArrayListQues1 {
	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		System.out.print("Enter an integer: ");
		List<Integer> list = new ArrayList<>();
		int num = console.nextInt();
		while (num != 0) {
			list.add(num);
			System.out.print("Enter an integer: ");
			num = console.nextInt();
		}
		if (!list.isEmpty()) {
			printList(list); // a)
			System.out.print("Enter an integer to find first occurence: ");
			int number = console.nextInt();
			System.out.println(findFirst(list, number)); // b)
			
			System.out.print("Enter an integer to find last occurence: ");
			number = console.nextInt();
			System.out.println(findLast(list, number));	// c)
			
			// d)
			sortAscending(list);
			printList(list);
			// e)
			sortDescending(list);
			printList(list);
		}
		else {
			System.out.print("Empty list.");
		}
		console.close();
	}
	public static void printList(List<Integer> list) {
		String res = "[";
		for (int i = 0; i < list.size()-1; i++) {
			res += list.get(i) + ", ";
		}
		res += list.get(list.size()-1) + "]";
		System.out.println(res);
	}
	public static String findFirst(List<Integer> list, int val) {
		int pos = list.indexOf(val);
		if (pos == -1) {
			list.add(0, val);
			return "Can't find number.";
		}
		return val + " is at index " + pos;
	}
	public static String findLast(List<Integer> list, int val) {
		int pos = list.indexOf(val);
		if (pos == -1) {
			list.add(val);
			return "Can't find number.";
		}
		return val + " is at index " + pos;
	}
	public static void sortAscending(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i+1; j < list.size(); j++) {
				if (list.get(j) < list.get(i)) {
					int temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
	}
	public static void sortDescending(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i+1; j < list.size(); j++) {
				if (list.get(j) > list.get(i)) {
					int temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
	}
}
