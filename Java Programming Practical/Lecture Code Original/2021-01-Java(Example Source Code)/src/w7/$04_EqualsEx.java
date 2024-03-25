/*
 int Ÿ���� width(�ʺ�)�� height(����) �ʵ带 ������ Rect Ŭ������ �ۼ��ϰ�, ������ ������
 �� Rect ��ü�� ���� ������ �Ǻ��ϴ� equals()�� �ۼ��϶�. �����ڿ��� �ʺ�� ���̸� �޾�
 width, height �ʵ带 �ʱ�ȭ�϶�
 */

package w7;


class Rect {
	private int width, height; 
	
	public Rect(int w,int h) {
		this.width = w; 
		this.height = h; }
	
	public boolean equals(Object obj) { // equals() ������ 
		Rect o = (Rect)obj; // �ٿ�ĳ���� 
		if (width*height == o.width*o.height)
			return true; 
		else return false; 
	}
}

public class $04_EqualsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect a = new Rect(2,3);
		Rect b = new Rect(3,2);
		Rect c = new Rect(3,4);
		if (a.equals(b)) 
			System.out.println("a is equals b");
		if (a.equals(c))
			System.out.println("a is equals c");
		if (b.equals(c))
			System.out.println("b is equals c");

	}

}
