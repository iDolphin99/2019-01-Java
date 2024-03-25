// �ؽø��� �̿��Ͽ� �л��� �̸��� �ڹ� ������ ��� �����ϴ� ���α׷��� �ۼ��϶�. 

package w8;

import java.util.*;

public class $06_HashMapScoreEx {

	public static void main(String[] args) {
		// ����� �̸��� ������ ����ϴ� HashMap �÷��� ���� 
		HashMap <String, Integer> dic = new HashMap <String, Integer> (); 
		
		// 5���� ���� ���� 
		dic.put("�輺��", 97);
		dic.put("Ȳ����", 88);
		dic.put("�賲��", 98);
		dic.put("���繮", 70);
		dic.put("�ѿ���", 99);
		
		// HashMap ����� ���� ���
		System.out.println("HashMap�� ��� ���� :" + dic.size());
		
		// ��� ����� ���� ���
		// HashMap�� ��� �ִ� ��� (key,value) �� ���
		// key ���ڿ��� ���� ���� Set �÷��� ���� -> Set interface ���� ���·� ��Ҹ� ������ �����ϴ� ���׸� 
		Set<String> set = dic.keySet();
		//System.out.println(set);
		
		// key ���ڿ��� ������� ������ �� �ִ� Iterator ���� 
		Iterator <String> it = set.iterator();
		
		while (it.hasNext()) {
			String name = it.next();
			int score = dic.get(name);
			System.out.println(name + ":" + score);
		}
		
	}

}
