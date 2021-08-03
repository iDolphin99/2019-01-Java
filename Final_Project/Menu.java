package Final_Project;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	// �ӽ÷� �Է� ���� ���� ������ ������
	static String name;
	static int studentID;
	static int pay;

	// 1. ���ϱ� �޼���
	public static Person Add() {
		// �迭�� ���� ��ü ����
		Person p = new Person();
		Scanner in = new Scanner(System.in);
		try {
			System.out.println("�̸� : ");

			name = in.next();
			p.setName(name);
			System.out.println("�й� : ");
			studentID = in.nextInt();
			// ���� �Է��� ���� �� ���� �ִ� ���� ���� ó���� ����
			in.nextLine();
			p.setStudentID(studentID);
			System.out.println("������ �ݾ� : ");
			pay = in.nextInt();
			in.nextLine();
			p.setPay(pay);
			System.out.println("******************");
			System.out.printf("\n\n\n\n");

		} catch (NumberFormatException e) {
			System.out.println("����� �Է��ϼ���.\n\n");
		} catch (Exception e) {
			System.out.println("����� �Է��ϼ���.\n\n");
		} // ���� ó�� ����, Ÿ�Կ� ���� �ʴ� ���� �Է����� ���

		return p;
	}

	// 2. ��� �޼���
	public static void Show(ArrayList<Person> List) {
		// �迭�� ���� �������� �ʾ��� ��� ���� �޽���
		if (List.isEmpty()) {
			System.out.println("�Էµ� ������ �����ϴ�.\n\n");
		} else {
			out: for (Person p : List) { // ��ü�� ������ �ִ� ���� �� ���� �ݾ��� ������ ������ �ƹ��͵� �Էµ��� �ʾ��� ���
				if (p.getName() == null | p.getStudentID() == 0) {
					System.out.println("�Էµ� ������ �����ϴ�.\n\n");
					List.remove(0); // ���� ������ ����Ǿ� �ִ� �迭 ��� ����
					break out;
				}
				System.out.println("�̸� : " + p.getName());
				System.out.println("�й� : " + p.getStudentID());
				System.out.println("���� ��� : " + p.getPay() + "\n\n");
			}
		}

	}

	// 3. ���� �޼���
	public static void Delete(ArrayList<Person> List) {
		Scanner in = new Scanner(System.in);
		// �迭�� ���� �������� �ʾ��� ��� ���� �޽���
		if (List.isEmpty()) {
			System.out.println("�Էµ� ������ �����ϴ�. \n\n");
		}

		else {
			for (Person p : List) {
				if (p.getName() == null | p.getStudentID() == 0) {
					System.out.println("�Էµ� ������ �����ϴ�.\n\n");
					List.remove(0);
					break;
				}
			}
			try {
				System.out.println("������ �л��� �й��� �Է��ϼ��� : ");
				studentID = in.nextInt(); // ����ڷκ��� ������ �л��� ��ȣ�� ����
				// �����Ǿ��ų� �̹� ���� �л� ��ȣ�� ��츦 ���� deleted ����
				boolean deleted = false;
				while (true) {
					for (int i = 0; i < List.size(); i++) {
						if (List.get(i).getStudentID() == studentID) {
							List.remove(i);
							deleted = true;
						}
					}
					if (deleted == false)
						System.out.println("���� �л��Դϴ�. \n\n");
					break;
				}
			} catch (Exception e) {
				System.out.println("����� �Է��ϼ���. \n\n");
				// ���� ó�� ����, ���� �̿��� ���� �Է��Ͽ��� ���
			}
		}
	}
}
