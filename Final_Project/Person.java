package Final_Project;
// ���Ƹ� ȸ���� ���� ��ü , �̸�, �й�, ���� �ݾ����� �̷���� �ִ�. 
public class Person {
	// �����ڿ� �����ڸ� ���ؼ� �����ؾ� ��
	private String name;
	private int studentID;
	private int pay;

	// Person class ������, ������ ���߱� ���� ������
	public Person(String name, int studentID, int pay) {
		this.name = name;
		this.studentID = studentID;
		this.pay = pay;
	}

	public Person() {
		this("������", 2018204094, 10000);
	}

	// ������
	public String getName() {
		return name;
	}

	public int getStudentID() {
		return studentID;
	}

	public int getPay() {
		return pay;
	}

	// ������
	public void setName(String name) {
		this.name = name;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

}
