// ������ ���׸� Ŭ������ �ۼ��ϰ�, 
// String�� Integer�� ������ ����ϴ� ���� ������. 

package w8;

import java.util.*;


class MyStack<T> {
	int tos;
	Object [] stck; 
	
	public MyStack() {
		tos = 0;
		stck = new Object[10];}
	public void push(T item) {
		if (tos == 10) return; 
		stck[tos] = item;
		tos++;}
	public T pop() {
		if (tos == 0) return null;
		tos--;
		return (T)stck[tos];}
}


public class $09_MyStack {

	public static void main(String[] args) {
		// String���� ��üȭ�� ���׸� Ŭ������ �����϶� 
		MyStack<String> stringStack = new MyStack<String>();
		stringStack.push("seoul");
		stringStack.push("busan");
		stringStack.push("LA");
		
		for (int i =0;i<3;i++)
			System.out.println(stringStack.pop());
		
		// Integer���� ��üȭ�� ���׸� Ŭ������ �����϶�  
		MyStack<Integer> intStack = new MyStack<Integer>();
		intStack.push(5);
		intStack.push(3);
		intStack.push(1);
		
		for (int i=0; i<3; i++)
			System.out.println(intStack.pop());
	}

}
