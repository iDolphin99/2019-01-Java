/* ����ڷκ��� �ݾ��� �Է¹ް� �� ������ ������ ȯ���Ͽ� ����ϴ� ���α׷� �ۼ� */

package Report02;

import java.util.Scanner;

public class HW1_Practice6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // ȯ���� ���� ����
		
		System.out.print("�ݾ��� �Է��Ͻÿ�>> ");
		int cash = sc.nextInt();
		
		for(int i=0;i<unit.length;i++) {
			if ((int)(cash/unit[i])==0) 
					continue;
			System.out.println(unit[i]+"�� ¥�� : "+cash/unit[i]+"��"); cash %= unit[i];}
	
		sc.close();
	}

}
