
public class Animal {
	String name; // ��ü����: Ŭ������ ����� ����(�ν��Ͻ� ����, �������, �Ӽ��̶�� ��)
	
	// setName�̶�� �޼ҵ�
	// void�� return���� ���ٴ� ��!
	public void setName(String name) {
		// this: Animal Ŭ������ ���� ������ ��ü�� ��Ī�Ѵ�.
		// ���⼭�� this�� cat, dog��ü�� ����Ų��.
		this.name = name;
	}
	
	public static void main(String[] args) {
		Animal cat = new Animal(); // ��ü ����
		cat.setName("boby"); // �޼ҵ� ȣ��
		
		Animal dog = new Animal();
		dog.setName("happy");
		
		// ��ü������ �������� �����Ƿ� ������ ��ü�� ���� name�� ��µȴ�.
		// ��, ��ü���� ���� ���������� �����ȴ�.
		// �⺻������ �������� ������, static�� ���� ������ ���� �ִ�.
		System.out.println(cat.name);
		System.out.println(dog.name);
	}
}
