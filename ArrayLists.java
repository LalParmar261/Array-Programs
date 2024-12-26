package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> alist = new ArrayList<>();
		
		System.out.println("Enter the elements: ");
		for (int i = 0; i < 5; i++) {
			alist.add(sc.nextInt());
		}
		
		System.out.print("The elements are: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(alist.get(i) + " ");
		}
	}
}
