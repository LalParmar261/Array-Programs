package arrays;

import java.util.Arrays;

public class ParallelArraySort {
	public static void main(String[] args) {
		int [] num = {1,9,2,7,4,8,5,3,21,32,54,76,98,985,3657,2323};
		String[] str = {"Abc", "Abcc", "Lal", "Zee", "Didi", "Jp"};
		
		Arrays.parallelSort(str);
		Arrays.parallelSort(num);
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(str));
	}
}

//Output:
//[1, 2, 3, 4, 5, 7, 8, 9, 21, 32, 54, 76, 98, 985, 2323, 3657]
//[Abc, Abcc, Didi, Jp, Lal, Zee]
