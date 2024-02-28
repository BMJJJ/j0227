package t2_operator;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	 String  res;
	 int su;
	 
	 System.out.print("점수를 입력하세요? ");
	 su = sc.nextInt();
	 
	 res = (su >= 60)? "합격" : "불합격" ;
	 System.out.println("점수 "+su+"는 "+res+" 입니다");
	 
	 sc.close();
	}
}
