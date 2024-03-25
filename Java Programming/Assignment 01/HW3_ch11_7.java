/* HashSet, addAll(), containsAll() ����ϱ� */

package Report01;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HW3_ch11_7 {

	public static void main(String[] args) {
		String[] s1 = { "a", "b", "a", "b", "c" };
		String[] s2 = { "c" };

		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();

		// �ΰ��� �迭�� addAll() �޼��带 �̿��� HashSet ��ü ����
		Collections.addAll(set1, s1);
		Collections.addAll(set2, s2);
		System.out.println("set1 : " + set1);
		System.out.println("set2 : " + set2); // HashSet ��ü ���

		// 2���� HashSet ��ü�� ���������� ���ϴ� �� ���
		System.out.println("set1 �� set2�� ���� : " + (set1 == set2));
		// s1�� ���� HashSet�� s2�� ���� HashSet ���Ҹ� ��� �����ϴ��� ���
		System.out.println("set1�� set2�� ��� ���Ҹ� �����Ѵ� : " + set1.containsAll(set2));
		// 2���� HashSet ������(set1�� ����������!), �������� ���� �� ���
		set1.addAll(set2);
		System.out.println("������ : " + set1.toString());
		set1.retainAll(set2);
		System.out.println("������ : " + set1.toString());
	}

}