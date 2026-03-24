package ex01;

public class TestCalc {

	public static void main(String[] args) {

		int n1 = 7;
		int n2 = 2;
		int result;
		result = add(7,2);
		System.out.println(result);
		
		result = add(n1, n2, 5);
		System.out.println(result);
		
	}
	
	// 객체 지향 프로그램의 overloading
	// java 는 함수가 이름이 같아도 되지만 인자(type 과 개수)는 달라야한다
	private static int add(int v1, int v2, int v3) {
		
		return v1 + v2 + v3;
	}

	private static int add(int v1, int v2) {
		
		return v1 + v2;
	}

}
