package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArr {
	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int b[] = Arrays.copyOf(a, 5);
		System.out.println("Copied data of a in b: ");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i] + " ");
		}
	}
}
