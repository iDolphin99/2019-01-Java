/*
* 6-8: ���ڿ��� �Է¹޾� �� ���ھ� ȸ������ ��� ����ϴ� ���α׷� �ۼ�.
- ��Ʈ: substring() �޼��� Ȱ��, nextLine()�� �̿��ϸ� ��ĭ�� �����Ͽ� �ѹ��� ������ ���� �� ����, ���ڿ�.length()

*(���� ���)

���ڿ��� �Է��ϼ���. �� ĭ�� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.

���� �ʸ� ����մϴ�. >> �Է¹��ڿ�
�� �ʸ� ����մϴ�.��  >> ���⼭���� ��� ���ڿ� 
 �ʸ� ����մϴ�.����
�ʸ� ����մϴ�.���� 
�� ����մϴ�.���� ��
 ����մϴ�.���� �ʸ�
����մϴ�.���� �ʸ� 
���մϴ�.���� �ʸ� ��
�մϴ�.���� �ʸ� ���
�ϴ�.���� �ʸ� �����
��.���� �ʸ� ����մ�
.���� �ʸ� ����մϴ�
���� �ʸ� ����մϴ�.  >> �������
 */

package Report02;

import java.util.Scanner;

public class HW2_Practice6_8 {

	public static void main(String[] args) {
		System.out.println("���ڿ��� �Է��ϼ���. �� ĭ�� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");
		
		Scanner sc = new Scanner(System.in);
		String txt = sc.nextLine(); //�Էµ� ���ڿ�
		
		//txt.length(), �޾Ƶ��� ���ڿ��� ���̸�ŭ for�� ���� 
		for(int i=0; i<txt.length(); i++) {
			//substring(������ index��ȣ, ������ index��ȣ)
			//���� index��ȣ���� ������ index��ȣ������ ���ڸ� ����
			String first = txt.substring(0,1);
			String last = txt.substring(1,txt.length());
			txt = last + first; 
			System.out.println(txt);}
		
		sc.close();
	}
}
