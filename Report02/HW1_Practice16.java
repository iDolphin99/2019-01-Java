/* ���������� ���� ���α׷� �ۼ� 
 * "�׸�"�� �Է½� ���α׷� ���� */

package Report02;

import java.util.Random;
import java.util.Scanner;

public class HW1_Practice16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		String RCP [] = {"����","����","��"};
   
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		while (true) {
			System.out.print("���� ���� ��!>>");

			String op = sc.next();
			if (op.equals("�׸�")) // "�׸�"�� �Է��� ��� ���α׷� ����
				break;
			String cp = RCP[rand.nextInt(3)]; // ��ǻ���� ���� ���� ��
			
			// ���� ���� �� �� 
			if (op.equals("����")) {
				if (cp == RCP[0]) System.out.println("�����=" + op + ", ��ǻ��=" + cp + ", �����ϴ�.");
				else if ( cp == RCP[1]) System.out.println("�����=" + op + ", ��ǻ��=" + cp + ", ��ǻ�Ͱ� �̰���ϴ�.");
				else System.out.println("�����=" + op + ", ��ǻ��=" + cp + ", ����ڰ� �̰���ϴ�.");
			}
			else if (op.equals("����")) {
				if (cp == RCP[0]) System.out.println("�����=" + op + ", ��ǻ��=" + cp + ", ����ڰ� �̰���ϴ�.");
				else if ( cp == RCP[1]) System.out.println("�����=" + op + ", ��ǻ��=" + cp + ", �����ϴ�.");
				else System.out.println("�����=" + op + ", ��ǻ��=" + cp + ", ��ǻ�Ͱ� �̰���ϴ�.");
				}
			else if (op.equals("��")) {
				if (cp == RCP[0]) System.out.println("�����=" + op + ", ��ǻ��=" + cp + ", ��ǻ�Ͱ� �̰���ϴ�.");
				else if ( cp == RCP[1]) System.out.println("�����=" + op + ", ��ǻ��=" + cp + ", ����ڰ� �̰���ϴ�.");
				else System.out.println("�����=" + op + ", ��ǻ��=" + cp + ", �����ϴ�.");
				}
			else // ���� ���� �� �̿��� ���� �Է��� ���
				System.out.println("�߸� �Է��ϼ̽��ϴ�. ");
		}
		System.out.println("������ �����մϴ�...");
		
	
		sc.close();
	}

}
