// ������ �ٷ�� ���͸� �����ϰ�, Ȱ���ϴ� �⺻ ��ʸ� ���δ�. 

package w8;

import java.util.Vector; 

public class $01_VectorEx {

	public static void main(String[] args) {
		// ���� ���� �ٷ�� ���׸� ���� ���� 
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(5);
		v.add(4);
		v.add(-1);
		
		// �߰��� �����ϼ��� 
		v.add(2, 100);
		
		// ���Ͱ� ������ �ִ� ��ü�� ���� �뷮�� ����ϼ��� 
		System.out.println("���� ���� ��� ��ü ��: " + v.size());
		System.out.println("������ ���� �뷮: " + v.capacity());
		
		// �÷����� ������ �ִ� ��� ��Ҹ� ������ ����ϼ��� 
		for (int i=0; i<v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);}
		
		// ���� ���� ��� ���� ���ϱ� 
		int sum = 0;
		for (int i=0; i<v.size(); i++) {
			int n= v.elementAt(i);
			sum += n;}
		System.out.println("���Ϳ� �ִ� ���� ��: " + sum);

	}

}
