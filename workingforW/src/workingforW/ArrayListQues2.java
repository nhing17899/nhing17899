package workingforW;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListQues2 {
	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		System.out.print("Enter a student name: ");
		List<String> list = new ArrayList<>();
		String name = console.nextLine();
		while (!name.equalsIgnoreCase("exit")) {
			list.add(name);
			System.out.print("Enter a student name: ");
			name = console.nextLine();
		}
		if (!list.isEmpty()) {
			printList(list); // 1)
			System.out.print("Enter a name to find first occurence: ");
			String val = console.nextLine();
			System.out.println(findFirst(list, val)); // 2)
			
			System.out.print("Enter a name to find last occurence: ");
			val = console.nextLine();
			System.out.println(findLast(list, val));	// 3)
			
			// 4
			System.out.print("Enter a name: ");
			val = console.nextLine();
			findOrUpdate(list, val);
			System.out.println();
			printList(list);
		}
		else {
			System.out.print("Empty list.");
		}
		console.close();
	}
	public static void printList(List<String> list) {
		String res = "[";
		for (int i = 0; i < list.size()-1; i++) {
			res += list.get(i) + ", ";
		}
		res += list.get(list.size()-1) + "]";
		System.out.println(res);
	}
	public static String findFirst(List<String> list, String val) {
		int pos = list.indexOf(val);
		if (pos == -1) {
			list.add(list.size()/2, val);
			return "Can't find name.";
		}
		return val + " is at index " + pos;
	}
	public static String findLast(List<String> list, String val) {
		int pos = list.indexOf(val);
		if (pos == -1) {
			String val1 = val.substring(0, val.length()/2);
			String val2 = val.substring(val.length()/2);
			list.add(0, val1);
			list.add(val2);
			return "Can't find name.";
		}
		return val + " is at index " + pos;
	}
	
	public static void findOrUpdate(List<String> list, String val) {
		String res = val + " appears at ";
		boolean found = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equalsIgnoreCase(val)) {
				res += i + " ";
				found = true;
			}
		}
		if (found) {
			System.out.print(res);
		}
		else {
			for (int i = 0; i < list.size(); i++) {
				String element = list.get(i);
				element += " " + val;
				list.set(i, element);
			}
			System.out.print("No name found. Updated list.");
		}
	}
}
