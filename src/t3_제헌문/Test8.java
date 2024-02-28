package t3_제헌문;

import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  su;
		
		System.out.println("수를 입력하세요");
		su = sc.nextInt();
		if(su %2 ==0) {
			System.out.println(""+su+"은 2의 배수이다");
		}
		else {
			System.out.println(""+su+"은 2의 배수가 아니다");
			if(su %3 ==0) {
				System.out.println(""+su+"은 3의 배수이다");
			}
			else {
				System.out.println(""+su+"은 3의 배수가 아니다");
				if(su %5 ==0) {
					System.out.println(""+su+"은 5의 배수이다");
					
				}
				else {
					System.out.println(""+su+"은 5의 배수가 아니다"); {
						
					}
				}
				sc.close();
			}
		}
		
		
	}

}
