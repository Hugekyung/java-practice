
public class Animal {
	String name; // 객체변수: 클래스에 선언된 변수(인스턴스 변수, 멤버변수, 속성이라고도 함)
	
	// setName이라는 메소드
	// void는 return값이 없다는 뜻!
	public void setName(String name) {
		// this: Animal 클래스에 의해 생성된 객체를 지칭한다.
		// 여기서는 this가 cat, dog객체를 가리킨다.
		this.name = name;
	}
	
	public static void main(String[] args) {
		Animal cat = new Animal(); // 객체 생성
		cat.setName("boby"); // 메소드 호출
		
		Animal dog = new Animal();
		dog.setName("happy");
		
		// 객체변수는 공유되지 않으므로 각각의 객체에 대한 name이 출력된다.
		// 즉, 객체변수 값은 독립적으로 유지된다.
		// 기본적으로 공유되지 않지만, static을 통해 공유할 수도 있다.
		System.out.println(cat.name);
		System.out.println(dog.name);
	}
}
