package prob1;

public class Prob1 {
	public static void main(String args[]) {
		char[] array1 = reverse("Hello World");
		printCharArray(array1);
		
		char[] array2 = reverse("Java Programming!");
		printCharArray(array2);
	}
	
	public static char[] reverse(String str) {
		/* 구현코드 */
		char[] arr1 = str.toCharArray();
		char[] arr2 = new char[arr1.length];
		
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[arr1.length - i-1];
		}
		
		return arr2;
	}
	
	public static void printCharArray(char[] array){
		/* 구현코드 */
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
	}
}
