// 1�� �ڵ带 Iterator<Integer> �� �̿��Ͽ� �����Ͽ��� 


package w8;

import java.util.Iterator;
import java.util.Vector;

public class $04_IteratorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(5);
		v.add(4);
		v.add(-1);
		
		// �߰��� �����ϼ��� 
		v.add(2, 100);
		
		// Iterator�� ����Ͽ� ��� ���� ����ϱ� 
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);}
		
		// Iterator�� ����Ͽ� ���� ���� ��� ���� ���ϱ� -> Unboxing
		int sum = 0;
		it = v.iterator();
		while (it.hasNext()) {
			int n = it.next();
			sum += n;
		}
		System.out.println("���Ϳ� �ִ� ���� ��: " + sum);
		
		
	}

}
