package t1_variable;

public class Test9 {
	public static void main(String[] args) {
		String str1 = "안녕";
		String str2 = "하세요";
		String name = "홍길동";
		
		System.out.println(str1 + str2);
		System.out.println(str1 +"\t" + str2);
		System.out.println(str1 +"\n" + str2);
		System.out.println(str1 +"'s" + str2);//작은 따옴표는 크게 문제안됨 ""가 문제
		System.out.println("안녕\"s하세요");
		System.out.println("안녕\\하세요");// \이건 제어코드
		
		
	}
}
