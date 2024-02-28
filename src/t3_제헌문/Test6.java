package t3_제헌문;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수를 입력하세요");
		int su1 ;
		 su1 = sc.nextInt();//정수 입력이기때문에 nextint
		//=는 ==이거로 써야된다.
		if(su1 %2==0) {
			System.out.println(""+su1+" 짝수 입니다");
		}
		else {
			System.out.println(""+su1+" 홀수 입니다");
		}
		sc. close();
	}
}
