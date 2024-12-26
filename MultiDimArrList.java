package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimArrList {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		// Initialization
		for (int i = 0; i < 4; i++) {
			list.add(new ArrayList<>());
		}
		
		//add elements
		System.out.println("Enter the elements: ");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				list.get(i).add(sc.nextInt());
			}
		}
		System.out.println(list);
	}
}
