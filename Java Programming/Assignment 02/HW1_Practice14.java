/* ����, ������ ����ϴ� ���α׷� �ۼ�
 * "�׸�"�� �Է½� ���α׷� ����
 * ���� ���� ���ؼ� ����ó�� �ۼ� */

package Report02;

import java.util.Scanner;

public class HW1_Practice14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String course [] = { "Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�" };
		int score [] = {95, 88, 76, 62, 55};
		boolean flag = false;
		
		while(true) {
			System.out.print("���� �̸�>> ");
			String op = sc.next();
			if (op.equals("�׸�"))  // "�׸�"�� �Է½� ���α׷� ���� 
				break;
			
			for (int i=0 ; i<course.length; i++) {
				if (course[i].equals(op)) {
					System.out.println(op + "�� ������ " + score[i] );
					flag = true;}}  // ������ ã���� true 
			if (flag==false) 		// ã�� ���ϸ� false
				System.out.println("���� �����Դϴ�.");
			
			flag=false;}
		
		sc.close();
	}
}
