package arrays;

public class FindElement {
	// find element.
	static boolean findEle(int []arr, int target, int index) {
		if (index == arr.length) {
			return false;
		}return arr[index] == target || findEle(arr, target, index + 1);
	}
	
	// find index of element..
	static int findIndex(int[] arr, int target, int index) {
		if (index == arr.length) {
			return -1;
		}
		if(arr[index] == target) {
			return index;
		}
		else {
			return findIndex(arr, target, index + 1);
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println(findEle(arr, 2, 0)); // output: true.
		System.out.println(findIndex(arr, 2, 0)); // output: 1.
	}
}
