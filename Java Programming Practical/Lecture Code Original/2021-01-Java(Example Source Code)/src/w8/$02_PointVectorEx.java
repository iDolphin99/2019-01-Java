// ��(x,y)�� ǥ���ϴ� Point Ŭ������ �����, Point�� ��ü�� �ٷ�� ���͸� �ۼ��϶� 

package w8;

import java.util.Vector;


class Point {
	private int x,y; 
	public Point(int x, int y) {
		this.x = x;
		this.y = y; 
	}
	public String toString() {
		return "(" + x + ", " + y + ")"; 
	}
}


public class $02_PointVectorEx {

	public static void main(String[] args) {
		// Point ��ü�� ��ҷθ� ������ ���� ���� 
		Vector<Point> v = new Vector<Point> ();
		
		// 3���� Point ��ü ���� 
		v.add(new Point(2,3));
		v.add(new Point(-5,20));
		v.add(new Point(30,-8));
		
		// �ε��� 1�� ��ü ���� 
		v.remove(1);
		
		// ���Ϳ� �ִ� ��� Point ��ü �˻��Ͽ� ��� 
		for (int i=0; i<v.size(); i++) {
			String str = v.get(i).toString();
			System.out.println(str);
			
			// Point p = v.get(i);
			// Sysout(p) -> p.toString()
		}
	}

}
