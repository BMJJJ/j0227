package t3_제헌문;
//2개의 수를 입력받아서 두개의수중,큰수와 작은수를 각각 출력해주시오.
import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su1,su2;
		
		System.out.println("첫번째 수를 입력하세요");
		su1 = sc.nextInt();
		
		System.out.println("두번째 수를 입력하세요");
		su2 = sc.nextInt();
		if(su1>su2) {
			System.out.println("큰수는"+su1+" 작은수는 "+su2+"이다");
				}
		else {
			if(su1<su2) {
				System.out.println("큰수는"+su2+"이고 작은수는 "+su1+"입니다");
				
			}
			
			sc.close();
		}
		
	}

}
