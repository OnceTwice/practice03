package prob4;

import java.util.*;

public class CalcApp {

	public static void main(String[] args) {
		// Scanner 와 String 클래스의 split 함수를 사용합니다.
		Scanner scanner = new Scanner(System.in);

		while(true) {
			System.out.print(">> ");
			String str = scanner.nextLine();
			
			if(str.equals("quit")) {
				break;
			}
			
			String[] arr = str.split(" ");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[2]);

			if (arr[1].equals("+")) {
				System.out.println(a + b);
			} else if (arr[1].equals("-")) {
				System.out.println(a - b);
			} else if (arr[1].equals("*")) {
				System.out.println(a * b);
			} else {
				System.out.println(a / b);
			}
			
			
		}
		
	}
}
