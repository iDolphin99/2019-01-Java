// id�� ��ȭ��ȣ�� �����Ǵ� Student Ŭ������ �����
// �̸��� 'Ű'�� �ϰ� Student ��ü�� '��'���� �ϴ� �ؽø��� �ۼ��϶�

package w8;

import java.util.*;


// �л��� ǥ���ϴ� Ŭ���� 
class Student {
	private int id;
	private String phone; 
	
	public Student (int i, String p) {
		this.id = i;
		this.phone = p;}
	
	public int getID() {return id;}
	public String getPhone() {return phone;}
}

public class $07_HashMapStudentEx {

	public static void main(String[] args) {
		// �л� �̸��� Student ��ü�� ������ �����ϴ� HashMap �÷��� ���� 
		HashMap<String, Student> map = new HashMap<String, Student>();
		
		// 3���� �л� ���� 
		map.put("Ȳ����", new Student(1, "010-111-1111"));
		map.put("���繮", new Student(2, "010-222-2222"));
		map.put("�賲��", new Student(3, "010-333-3333"));

		// "exit"�� �Է��� �� ���� �˻�
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("�˻��� �̸�?");
			String name = sc.next();
			
			if (name.equals("exit"))	break;
			
			Student student = map.get(name);
			
			if (student == null)	System.out.println(name + "�� ���� ����Դϴ�.");
			else System.out.println("id:" + student.getID() + ", ��ȭ:" + student.getPhone());
		}
		
	}

}
