/*
 ��ü ���۷����� ��ü�� Ŭ���� ��, �ؽ��ڵ� ��, ��ü�� ���ڿ��� ����غ��� 
 */

package w7;


class Point {
	public int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;}

}

public class $02_ObjectPropertyEx {
	public static void print(Object obj) { // ��ĳ���� 
		System.out.println(obj.getClass().getName());  // ��ü�� ���� ������ ���� ��, ������ Ŭ���� �̸��� ��ȯ -> Ŭ���� �̸� ��ȯ 
		System.out.println(obj.hashCode());			   // ��ü�� ������ ���� ��, �ؽ��ڵ� �� 
		System.out.println(obj.toString());			   // ��ü�� ���ڿ� ������ ������ ��ȯ 
		System.out.println(obj);					   // ��ü�� ���, �ڵ����� toString()�� ȣ������ 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(2,3);
		print(p);
	}

}
