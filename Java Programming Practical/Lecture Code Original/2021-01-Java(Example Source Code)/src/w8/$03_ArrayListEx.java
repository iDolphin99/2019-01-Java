// �̸��� 4�� �Է¹޾� ArrayList�� �����ϰ� ��� ����� �� ���� �� �̸��� ����϶�. 


package w8;

import java.util.ArrayList;
import java.util.Scanner;
// import java.util.*;

public class $03_ArrayListEx {

	public static void main(String[] args) {
		// ���ڿ��� ���� ������ ArrayList �÷��� ���� 
		ArrayList<String> list = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		// Ű����κ��� 4���� �̸��� �Է¹޾� ArrayList�� ����
		for (int i =0; i<4; i++) {
			System.out.print("�̸��� �Է��ϼ���>>");
			String s = sc.next();
			list.add(s);}
		
		// ArrayList�� ��� �ִ� ��� �̸� ��� 
		for (int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.print(str + " ");}
		
		// ���� �� �̸� ���
		int longidx= 0;
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).length() > list.get(longidx).length())
				longidx = i; }
		System.out.println("\n���� �� �̸���: " + list.get(longidx));
		
	}

}
