/* interface class ���� method overriding */

package Report01;

interface Flyable {
	void speed();
	void height();
}

public class HW2_FlyableTest {
	public static void main(String[] args) {
		// ���� ���� Ŭ���� ����, FlyableTest Ŭ������ ��� �ʵ� f
		Flyable f = new Flyable() {
			public void speed() {
				System.out.println("�ӵ�");}

			public void height() {
				System.out.println("����");}
		}; 
		// �� �� �̻��� �ڵ� �ʿ� - requirements
		f.speed();
		f.height();
	}
}
