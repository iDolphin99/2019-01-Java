/* �ܵ� ��� ���α׷� (5000/1000/500/100/50/10/5) */

package Report01;

import java.util.Scanner;

public class HW1_Homework {

	public static void main(String[] args) {

		while(true) {// ����ڰ� 0�� �Է½� Ż��			
			Scanner in = new Scanner(System.in); 
			System.out.print("��ǰ ���� �Է�(1 ~ 10000): ");
			int price = in.nextInt();     // ��ǰ ������ price ������ ���� 
			
			if (price == 0)  break;       // ����ڰ� 0�� �Է½� Ż�� 
			
			System.out.print("���� �ݾ� �Է�(1 ~ 10000): ");
			int pay = in.nextInt();       // ���� �ݾ��� pay ������ ���� 
			
			int charge = pay - price;     // �ܵ��� charge ������ ���� 
			// ������ �ش�Ǵ� �ݾ׸�ŭ charge���� ���� ���� ���, �� �� ������ �ش�Ǵ� �ݾ׸�ŭ ���� �������� charge�� ���� 
			System.out.printf("-5000��: %d�� \n", charge/5000);  charge %= 5000;  
			System.out.printf("-1000��: %d�� \n", charge/1000);  charge %= 1000;
			System.out.printf("-500��: %d�� \n", charge/500);    charge %= 500; 
			System.out.printf("-100��: %d�� \n", charge/100);    charge %= 100; 
			System.out.printf("-50��: %d��, ", charge /50); 	   charge %= 50; 
			System.out.printf("10��: %d��, ",charge/10);		   charge %= 10; 
			System.out.printf("5��: %d��, ",charge/5);		   charge %= 5; 
			System.out.printf("1��: %d��, \n",charge/1);		   charge %= 1; 
			System.out.println("=====================================");	}
		
		System.out.println("���α׷� ����......");

	}

}
