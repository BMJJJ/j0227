package t1_variable;

//자동 타입변환
public class Test7 {
	public static void main(String[] args) {
		int su1 = 100;
		double su2 = 3.14;
		
		su1 = su1 + 200;
		System.out.println("su1 : " + su1);
		
		//su1 = su1 + su2 ;
		su2 = su1 + su2; // double타입으로 자동변환된다
		System.out.println("su2 : " + su2);
		//정수와 실수를 더하면 더 큰수인 실수를 사용하는 타입을 사용해야 한다.(정수로는 표기가 안됨)
		
		double result;
		result = su1 + su2;// double타입으로 자동변환된다
		System.out.println("1.result : " + result);
		
		result = su1 + su2; // double타입으로 자동변환된다
		System.out.println("2.result : " + result);
		
		int atom;
		atom = 1 + 2 * 3;
		System.out.println("atom : "+ atom);
		
		char cc1 = 'A';
		int res2 = cc1 + 1;
		System.out.println("res2 : " + res2);
		System.out.printf("res2 = %d\n", res2);
		System.out.printf("res2 = %c\n", res2);
		// printf는 지정식이라 %필요
		System.out.println();
		
		String ss1 = "안녕하세요!";
		System.out.println("ss1 : " + ss1);
		System.out.printf("ss1 : %s\n", ss1 );
		
		double dd1 = 3.141592;
		System.out.println("dd1 : " + dd1);
		System.out.printf("dd1 : %f\n" , dd1);
		System.out.printf("dd1 : %.2f\n" , dd1);
		System.out.printf("dd1 : %6.2f\n" , dd1);
	}
}
