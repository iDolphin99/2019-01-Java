package Report_Practice;

public class HW1_Complex {
	double real, imaginary; // real�� �Ǽ� imaginary�� ��� ���� 

	// ������ �Ǽ� �κа� ��� �κ��� ���� ��ü ������
	public HW1_Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	} 

	// ��� �κ��� 0�� ��ü ������
	public HW1_Complex(double real) {
		this(real, 0.0);
	} 

	// ��ü�� ���Ҽ� �κ��� ǥ��
	void print() {
		System.out.println(real + " + " + imaginary + "i");
	} 
}