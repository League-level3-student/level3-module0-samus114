package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
String strenges[] = {"save", "me", "please", "im", "haooy"};
		//2. print the third element in the array
System.out.println(strenges[2]);
		//3. set the third element to a different value
strenges[2] = "yoink";
		//4. print the third element again
System.out.println(strenges[2]);	
		//5. use a for loop to set all the elements in the array to a string of your choice
for (int i = 0; i < strenges.length; i++) {
	strenges[i] = "funny";
}		
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < strenges.length; i++) {
			System.out.println(strenges[i]);
		}
		//7. make an array of 50 integers
int many[] = new int[50];
		//8. use a for loop to make every value of the integer array a random number
for (int i = 0; i < many.length; i++) {
	Random rand = new Random();
	many[i] = rand.nextInt(100);
}
		//9. without printing the entire array, print only the smallest number on the array
int smallest = many[0];
for (int i = 0; i < many.length; i++) {
	if (smallest > many[i]) {
		smallest = many[i];
	}
}
System.out.println(smallest);
		//10 print the entire array to see if step 8 was correct
for (int i = 0; i < many.length; i++) {
	System.out.println(many[i]);
}
		//11. print the largest number in the array.
	int biggest = many[0];
for (int i = 0; i < many.length; i++) {
			if (biggest < many[i]) {
				System.out.println(many[i]);
			}
		}
		//12. print only the last element in the array
System.out.println(many.length-1);
	}
}
