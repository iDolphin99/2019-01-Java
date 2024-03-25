/* ArrayList Collection�� ����� �迭 ���� �� Collection method ����ϱ� */

package Report01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HW3_ch11_8 {

	public static void main(String[] args) {
		String[] s = { "������", "�����", "������" };
		// ���ǿ� �´� ArrayList���� - requirements
		List<String> list = new ArrayList<String>(Arrays.asList("����", "����"));
		System.out.println(list);
		List<String> al1 = new ArrayList<>(list);
		System.out.println("nCopies : " + al1);// ���� �� al1����Ʈ ����

		// ����Ʈ�� ��� ���Ҹ� '��'�� ����� ���
		Collections.fill(al1, "��");
		System.out.println("'��'�� ä�� �� : " + al1);
		// s�� al1�� �߰��ؼ� ���
		Collections.addAll(al1, s);
		System.out.println("����Ʈ�� ��� �߰��� �� : " + al1);
		// ����Ʈ �������� �����Ͽ� ���
		Collections.shuffle(al1);
		System.out.println("����Ʈ�� ���� �� : " + al1);
		// ����Ʈ ���� ���� �� ���
		Collections.reverse(al1);
		System.out.println("����Ʈ�� �������� ������ �� : " + al1);
		System.out.println("����Ʈ���� �ּ� : " + Collections.min(al1));				  // Collections��� �̿��� ����Ʈ �ּҰ� ���
		System.out.println("����Ʈ���� �ִ� : " + Collections.max(al1));				  // Collections��� �̿��� ����Ʈ �ִ밪 ���
		System.out.println("����Ʈ���� ���� �� : " + Collections.frequency(al1, "��"));// �ش� ����Ʈ�� '��' ������ �󵵼� ���
	}
}