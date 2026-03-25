package ex07;

interface Duck {
	void swim();
}

interface Racoon{
	void dig();
}

class DuckRacoon implements Duck,Racoon{

	@Override
	public void dig() {
		System.out.println("땅을 판다");
	}

	@Override
	public void swim() {
		System.out.println("헤엄을 친다");
	}
	
}

public class TestDuckRacoon {

	public static void main(String[] args) {
		DuckRacoon dr = new DuckRacoon();
		dr.swim();
		dr.dig();
		
		
		
	// 모든 자바의 class 는 object class 를 상속받아서 만들어졌다.
	// toString : heap 메모리  위치를 16진수
	// hashcode : heap 메모리  위치
	// getclass : class 정보
		
	}

}
