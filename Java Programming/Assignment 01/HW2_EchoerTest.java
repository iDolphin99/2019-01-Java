/* �߻� class�� �̿��ؼ� "��" �Է��� ������ ���ڿ� ���� */

package Report01;

import java.util.Scanner;

abstract class Echoer {
	void start() {
		System.out.println("�����մϴ�.");}

	abstract void echo();
	
	void stop() {
		System.out.println("�����մϴ�.");}
}

public class HW2_EchoerTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Echoer e = new Echoer() {
			// echo �޼��� �߰�
			void echo() {
				while (true) {
					String s = in.nextLine(); // ���� ���� �Է¹޾� ������� ���� ���ڿ� s�� ����
					System.out.println(s); 	  // ���ڿ� s ���
					if (s.equals("��")) 		  // ���ڿ� s�� '��'�� �Է¹����� ����
						break; 				}}
		};
		// �� �� �̻��� �ڵ� �ʿ� - requirements
		e.start();
		e.echo();
		e.stop();
	}
}
