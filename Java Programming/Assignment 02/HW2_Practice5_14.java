/*
* 5-14: main()�� ���� ����� �����Ͽ�  Shape �������̽��� ������ Circle, Oval, Rect �� �ۼ��Ͽ�, ��ü ���α׷� �ϼ�.
*/

package Report02;

interface Shape2 {
	final double PI = 3.14;
	void draw();      // ������ �׸��� �߻� �޼ҵ�
	double getArea(); // ������ ������ �����ϴ� �߻� �޼ҵ�
	// default method
	default public void redraw() { 
		System.out.print("--- �ٽ� �׸��ϴ�. ");
		draw();	
	}
}

class Circle2 implements Shape2 {
	//�ʵ�, r:������
	private int r; 
	
	//������
	Circle2(int r){this.r = r;}
	
	//�������̽� �޼��� ����, Override
	@Override
	public void draw() {System.out.println("�������� "+ r +"�� ���Դϴ�.");}
	@Override
	public double getArea() { return r*r*PI;}
}

class Oval2 implements Shape2 {
	//�ʵ�, w:����, h:����
	private int w,h; 
		
	//������
	Oval2(int w, int h){this.w = w;	this.h = h;}
		
	//�������̽� �޼��� ����, Override
	@Override
	public void draw() {System.out.println(w+"x"+h +"�� �����ϴ� Ÿ���Դϴ�.");}
	@Override
	public double getArea() { return w*h*PI;}
}

class Rect2 implements Shape2 {
	//�ʵ�, w:����, h:����
	private int w,h; 
			
	//������
	Rect2(int w, int h){this.w = w;	this.h = h;}
			
	//�������̽� �޼��� ����, Override
	@Override
	public void draw() {System.out.println(w+"x"+h +"ũ���� �簢���Դϴ�.");}
	@Override
	public double getArea() { return w*h;}
}



public class HW2_Practice5_14 {

	public static void main(String[] args) {
		Shape2 [] list = new Shape2[3]; // Shape�� ��ӹ��� Ŭ���� ��ü�� ���۷��� �迭
		list[0] = new Circle2(10);      // �������� 10�� �� ��ü
		list[1] = new Oval2(20, 30);    // 20x30 �簢���� �����ϴ� Ÿ��
		list[2] = new Rect2(10, 40);    // 10x40 ũ���� �簢��
		
		for(int i=0; i<list.length; i++) 
			list[i].redraw();

		for(int i=0; i<list.length; i++) 
			System.out.println("������ " + list[i].getArea());
	}
}
