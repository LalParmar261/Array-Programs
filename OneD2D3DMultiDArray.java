package arrays;

public class OneD2D3DMultiDArray {
	public static void main(String[] args) {
		int arr[][] = {{1,2,3,4},{4,5,6,7}, {7,8,9,10},{1,2,3,4}};
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4  ; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
