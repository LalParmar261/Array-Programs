package arrays;

public class Arraysssss {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int sum = 0;
		System.out.print("Elements are: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("Sum of Arrays is: "); // Sum of array elements------------
		for (int i : arr) {
			sum += i;
		}
		System.out.print(sum);
	}
}
