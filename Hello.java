package kr.com.beak;

/*
 * Java 프로그래밍은 편집 -> 컴파일 -> 실행 단계를 거쳐 완성
 */

// Hello 클래스 선언
public class Hello {
	
	// print() 메서드
	public void print(String name) {
		System.out.println("Hello, " + name);
	}
	
	public static void main(String[] args) {
		// new 키워드를 사용해 객체 생성
		Hello hello = new Hello();
		hello.print("Java");
		
	}

}
