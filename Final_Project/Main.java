package Final_Project;

/*
- ���� ����
- ����Ŭ����, �߻�Ŭ����(�Ǵ� �������̽�) ���� �����ؼ� �� 3�� �̻� Ŭ������ ����
- ��� Ŭ������ ������ ������ ��(�������̽� �� ��� ����)
- �ּ� 1�� private �ν��Ͻ� ���� ����� ��   
- �ּ� 1���� ����ó�� ���� ����� ��.
- ArrayList (�Ǵ�  ��Ÿ �÷���.����11��) ����� ��.
- ������ �ڹ� ���Ϸ� �ۼ��� ��.(�ּ� �ʼ�)
 */

import java.util.ArrayList;
import java.util.Scanner;;

public class Main {
	public static void main(String[] args) {
		ArrayList<Person> List = new ArrayList<>(); // ���Ƹ� ȸ�� ���� �Է��� ���� ArrayList List ����, Person ��ü Ÿ�� ����
		Scanner in = new Scanner(System.in);
		int select = 0; // ����ڷκ��� ��� ������ �ޱ� ����

		// ����ڷκ��� 4���� �Է¹��� �� ���� ��� ����
		out: while (true) {
			System.out.println("*** ���Ƹ� ȸ�� ��� ***");
			System.out.println("1.���Ƹ� ȸ�� �Է� ");
			System.out.println("2.���Ƹ� ȸ�� ��� ");
			System.out.println("3.���Ƹ� ȸ�� ���� ");
			System.out.println("4.����");
			System.out.println("******************");
			System.out.println("���ϴ� ����� �Է��ϼ��� : ");
			select = in.nextInt();

			// ����ڷκ��� ���� ��ȣ�� �ش� �޴��� �̵�
			switch (select) {
			case 1:
				List.add(Menu.Add());
				break;
			case 2:
				Menu.Show(List);
				break;
			case 3:
				Menu.Delete(List);
				break;
			case 4:
				System.out.println("\n\n�� ����~~^..^");
				break out;
			default: // �޴� �̿��� ��ȣ �Է� ���� ���
				System.out.println("�ٽ� �Է��ϼ���.");
				break;
			}
		}
	}

}
