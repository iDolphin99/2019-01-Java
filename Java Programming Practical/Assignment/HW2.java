package Report_Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class HW2{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		// Ű�� ���� String Ÿ���� Map
		Map<String, String> m = new HashMap<>();

		// HashMap�� 5���� ��ü �߰�
		m.put("�Ϻ�", "����");
		m.put("������", "���帮��");
		m.put("����", "īƮ����");
		m.put("��Ż����", "�θ�");
		m.put("ü��", "������");

		// HashMap�� �ִ� ��� Ű�� ArrayList Ÿ������ ��ȯ
		List<String> list = new ArrayList<>(m.keySet());

		System.out.println("*** ���� ���߱� ���� ���� ***");
		while (true) {
			// �ε����� 0~5 ������ int Ÿ���� ���� ���Ҹ� key�� ����
			String key = list.get(r.nextInt(5));
			System.out.print(key + "�� ������? ");
			String s = in.next();

			// ����ڷκ��� '����'�� �Է� ������
			if (s.equals("����")) {
				System.out.println("���� ����...");
				break; // �ݺ��� Ż��
			}
			// �Է��� ���� �־��� Ű�� �ش��ϴ� ��, �����̸�
			if (s.equals(m.get(key)))
				System.out.println("����!!"); // �����Ͻ�
			else
				System.out.println("�ƴմϴ�!!"); // �����Ͻ�
		}
	}

}
