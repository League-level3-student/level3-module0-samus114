package _03_More_Array_Fun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MoreArrayFun {
	String multi[] = {"0", "1", "2", "3", "4"};
	static MoreArrayFun MAF = new MoreArrayFun();


	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		MAF.printer();
		MAF.retnirp();
		MAF.pitr();
		MAF.trepinr();
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	void printer() {
		for (int i = 0; i < multi.length; i++) {
			System.out.println(multi[i]);
		}
		System.out.println("----- 1st METHOD ------");
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings in the array in reverse order.
	void retnirp() {
		for (int i = multi.length - 1; i >= 0; i--) {
			System.out.println(multi[i]);
		}
		System.out.println("----- 2nd METHOD ------");
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	void pitr() {
		for (int i = 0; i < multi.length; i++) {
			if (i % 2 == 0) {
				System.out.println(multi[i]);
			}
		}
		System.out.println("----- 3rd METHOD ------");
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array in a completely random order. Almost every run of the program
	// should result in a different order.
	void trepinr() {
		ArrayList<String> array = new ArrayList<String>(Arrays.asList(multi));
		while (array.size() > 0) {
			Random rand = new Random();
			int nextString = rand.nextInt(array.size());
			System.out.println(array.get(nextString));
			array.remove(nextString);
		}
	}
}