// 9���� MyStack -> GStack�� �̿��Ͽ� �־��� ������ ������ �ݴ�� ����� �޼ҵ� reverse()�� �ۼ����� 

package w8;

class GStack<T> {
	int idx;
	Object [] stck; 
	
	public GStack() {
		idx = 0;
		stck = new Object[10];}
	public void push(T item) {
		if (idx == 10) return; 
		stck[idx] = item;
		idx++;}
	public T pop() {
		if (idx == 0) return null;
		idx--;
		return (T)stck[idx];}
}

public class $10_GenericMethodEx {
	public static <T> GStack<T> reverse(GStack<T> stack){
		GStack<T> newstack = new GStack<T>();
		
		while (true) {
			T tmp; 
			tmp = stack.pop();
			if (tmp == null) break;
			else newstack.push(tmp);}
		
		return newstack;}

	public static void main(String[] args) {
		// Double Ÿ���� GStack ���� 
		GStack <Double> gs = new GStack<Double> ();
		
		// 5���� ��Ҹ� ���ÿ� push 
		for (int i=0; i<5; i++)
			gs.push(new Double(i));
		
		// reverse�Լ��� �̿��Ͽ� ��� 
		gs = reverse(gs);
		for (int i=0; i<5; i++)
			System.out.println(gs.pop()); 
	}

}
