package arrays;

import java.util.Scanner;

public class DeleteElement { // *------ Delete Array Element. -----*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		System.out.println("Enter Array Elements: ");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter Array Location: ");
		int loc = sc.nextInt();
		for (int i = loc; i < size-1; i++) {
			a[i] = a[i+1];
		}
		size--;
		for (int i = 0; i < size; i++) {
			System.out.println(a[i] + " ");	
		}
	}
}
