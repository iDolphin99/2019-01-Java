package Report_Practice;

public class HW1_GolfClub {
	int iron;
	String club;
	boolean isIron; // �Ű� ������ �������� �ƴ����� ���� ���¸� �����ϴ� ����

	// ������ �Է¹޾��� �� ������ ���̾��� ���� ��ü ������
	public HW1_GolfClub(int iron) {
		this.iron = iron;
		isIron = true;
	} 

	// 7�� ���̾� ��ü�� �����ϴ� �⺻ ������
	public HW1_GolfClub() {
		this(7);
	} 
	
	// ���ڿ��� �Է¹޾��� �� ������ Ŭ���� ���� ��ü ������
	public HW1_GolfClub(String club) {
		this.club = club;
	} 

	// �Ű� ������ �������� �ƴ����� ���� Ŭ�� ǥ�� 
	void print() { 
		if (isIron) {
			System.out.println(iron + "�� ���̾��Դϴ�.");
		} else {
			System.out.println(club + "�Դϴ�.");
		}
	} 
}