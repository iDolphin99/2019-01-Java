/*
 Point Ŭ�������� Point ��ü�� ���ڿ��� �����ϴ� toString()�޼��带 �ۼ��϶�. 
 */

package w7;


class PPoint extends Point{
	public PPoint(int x, int y){
		super(x,y);
	}
	// class ���ο��� ������, 
	public String toString() { 
		return "Point(" + x +  ", " + y + ")";
	}
}


public class $03_ToStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PPoint p = new PPoint(2,3);
		//System.out.println(p.toString()); �Ʒ��� ���� �ǹ� 
		System.out.println(p);  		  // p�� toString()���� �ڵ� ��ȯ 
		System.out.println(p + "�Դϴ�.");  
	}

}
