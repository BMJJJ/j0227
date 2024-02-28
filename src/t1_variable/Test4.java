package t1_variable;

//실수 자료형(float(4Byte),double(8byte))
public class Test4 {
	public static void main(String[] args) {
		double dd1, dd2;
		dd1 = 3.14592;
		dd2 = 3.1459221231321231321;
		System.out.println("dd1 : "+dd1);
		System.out.println("dd2 : "+dd2);
		System.out.println();
		
		float ff1, ff2;
		ff1 = 3.14f; //실수형의 기본은 double이지만 float로 선언
		System.out.println("ff1 : " + ff1);
		
		
		ff2 = 3.1459221231321231321f;
		System.out.println("ff2 : " + ff2);
		
		double dd3 = 5E3, dd4 = 5E-3; //E는 10의3승이란 의미 
		System.out.println("dd3 : " + dd3);
		System.out.println("dd4 : " + dd4);
	}

}
