public class Test {
	// �޼ҵ��� �������� �ۼ� ���
	public int sum(int a, int b) {
		return a+b; // sum�̶�� �޼ҵ� ����
	}
	
	// �Է°��� ���� �޼ҵ�
	public String say() {
		return "Hi";
	}
	
	// ���ϰ��� ���� �޼ҵ�(�ڷ����� �ƴ� void�� ���ϰ��� ������ ���Ѵ�.)
	public void sumtwo(int a, int b) {
		System.out.println(a+"�� "+b+"�� ���� "+(a+b)+"�Դϴ�.");
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
