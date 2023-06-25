import java.util.Scanner;

public class subArray {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scn.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				for (int j2 = i; j2 <=j; j2++) {
					System.out.print(arr[j2]+"\t");
				}
				System.out.println();
			}
		}
	}
}
