/* ����ڷκ��� ������ �Է¹��� �� ������ ������ŭ ���� ���� ��� ���α׷� �ۼ� */

package Report02;

import java.util.Random;
import java.util.Scanner;

public class HW1_Practice8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		// ������ �Է¹��� �� �迭 ���� 
		System.out.print("���� �? ");
		int n = sc.nextInt();
		int [] unit = new int[n];
		
		// ���� ���� �ֱ� 
		for (int i=0; i<n ; i++) {
			unit[i] = rand.nextInt(99)+1;
			for (int j=0;j<i;j++) {  // �ߺ��� ���� ���� 
				if (unit[j]==unit[i])
						i--;}}
		
		// ���� ��� 
		for (int number : unit)
			System.out.print(number + " ");
		
		sc.close();
	}
}
