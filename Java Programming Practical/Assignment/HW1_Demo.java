package Report_Practice;

public class HW1_Demo {
	public static void main(String[] args) {
		HW1_Complex c1 = new HW1_Complex(2.0);      // �Ű� ������ �ϳ��� ������ �׽�Ʈ
		c1.print(); 
		HW1_Complex c2 = new HW1_Complex(1.5, 2.5); 
		c2.print();    					    // �Ű� ������ ���� ������ �׽�Ʈ

		System.out.println();

		HW1_GolfClub g1 = new HW1_GolfClub();       // �⺻ ������ �׽�Ʈ
		g1.print(); 
		HW1_GolfClub g2 = new HW1_GolfClub(8);      // �Ű� ������ ������ ������ �׽�Ʈ
		g2.print(); 
		HW1_GolfClub g3 = new HW1_GolfClub("����");  // �Ű� ������ ���ڿ��� ������ �׽�Ʈ
		g3.print(); 
	}
}