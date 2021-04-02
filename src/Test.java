public class Test {
	// 메소드의 전형적인 작성 방법
	public int sum(int a, int b) {
		return a+b; // sum이라는 메소드 생성
	}
	
	// 입력값이 없는 메소드
	public String say() {
		return "Hi";
	}
	
	// 리턴값이 없는 메소드(자료형이 아닌 void는 리턴값이 없음을 뜻한다.)
	public void sumtwo(int a, int b) {
		System.out.println(a+"과 "+b+"의 합은 "+(a+b)+"입니다.");
	}

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		
		Test myTest = new Test();
		int c = myTest.sum(a, b);
		
		String d = myTest.say();
		
		myTest.sumtwo(3, 4);
		System.out.println(c);
		System.out.println(d);

	}

}
