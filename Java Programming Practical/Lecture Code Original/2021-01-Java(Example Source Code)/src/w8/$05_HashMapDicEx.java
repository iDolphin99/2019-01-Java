// (����,�ѱ�) �ܾ ������ �ؽøʿ� �����ϰ� ����� �ѱ��� �˻��ϴ� ���α׷��� �ۼ��϶�. 
// "exit"�� �ԷµǸ� ���α׷��� �����Ѵ�. 


package w8;

import java.util.HashMap;
import java.util.Scanner;

public class $05_HashMapDicEx {

	public static void main(String[] args) {
		// ���� �ٳտ� �ѱ� �ܾ��� ���Ӹ� �����ϴ� HashMap �÷��� ���� 
		HashMap<String,String> dic = new HashMap<String, String> (); 
		
		// 3���� (key,value) ���� dic�� ���� 
		dic.put("baby", "�Ʊ�");
		dic.put("love", "���");
		dic.put("apple", "��� ");
		
		// ���� �ܾ �Է¹ް� �ѱ� �ܾ� �˻�, "exit" �Է¹����� ���� 
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("ã�� ���� �ܾ��?");
			String eng = sc.next();
			
			if(eng.equals("exit"))
				break;
			
			String kor = dic.get(eng);
			if (kor == null)	System.out.println(eng + "�� ���� �ܾ� �Դϴ�.");
			else				System.out.println(kor);
		}
		System.out.println("�����մϴ�...");
	}

}
