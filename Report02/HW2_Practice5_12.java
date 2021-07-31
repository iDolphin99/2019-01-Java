/*
* 5-12: ����(5.6���� 5.7��)���� ��ʷ� �� �߻� Ŭ���� Shape�� Line, Rect, Circle Ŭ���� �ڵ带 Ȱ���Ͽ� �Ʒ� ���� ���� ó�� 
* "����", "����", "��� ����", "����"�� 4���� ����� �����ϴ� GrapicEditor Ŭ���� �ۼ�.

* ������ �� index ��ȣ�� 0������ ������ �ۼ��Ͽ����ϴ�!  
*/

package Report02;

import java.util.Scanner;

//�߻�Ŭ����
abstract class Shape {
	private Shape next;
	public Shape() { next = null;}
	public void setNext(Shape obj) {next = obj;} // ��ũ ����
	public Shape getNext() {return next;}
	public abstract void draw();
}


class Circle extends Shape {
	@Override
	public void draw() {
		 System.out.println("Circle");}}


class Line extends Shape {
	@Override
	public void draw() {
		 System.out.println("Line");}}


class Rect extends Shape {
	@Override
	public void draw() {
		 System.out.println("Rect");}}


/*********** �ʿ��ϴٸ� �޼ҵ� �߰� ����-> print() �޼��� �߰� **************/
class GraphicEditor {  
	//�ʵ� ����
	public String name; 
	private Shape head, tail;           
	Scanner sc = new Scanner(System.in);

	//������ �ۼ�
	public GraphicEditor(String name) {
		this.name = name;
		head = null;  //head Node
		tail = null;  //tail Node
	}

	public void run() {
		System.out.println("�׷��� ������ " + name + "�� �����մϴ�.");
		
		while(true) {
		System.out.println("\n����(1), ����(2), ��� ����(3), ����(4)>>");
		int op = sc.nextInt();
		
		switch (op) {
		//����
		case 1: 
			System.out.println("Line(1), Rect(2), Circle(3)>>");
			op = sc.nextInt();
			insert(op);
			break;
		//����
		case 2: 
			System.out.println("������ ������ ��ġ>>");
			op = sc.nextInt();
			boolean flag = delete(op);
			if (flag==false) //flag�� false�� ��� ���� ����
				System.out.println("������ �� �����ϴ�.");
			break;
		//��κ���
		case 3 :
			print();
			break;
		//����
		case 4: 
			System.out.println("\n" + name + "�� �����մϴ�.");
			sc.close();  //Scanner ��ü �ݾ��ֱ�! 
			return; }	}
	}

	//���� �޼���
	private void insert(int choice) {
		 Shape grapic;
	      switch(choice) {
	      case 1:
	         grapic = new Line();
	         break;
	      case 2:
	         grapic = new Rect();
	         break;
	      case 3:
	         grapic = new Circle();
	         break;
	      default:
	         System.out.println("�ٽ� �Է��� �ּ���.");
	         return;}
	      
	      if(head == null) { // head�� �ƹ��͵� ����Ű�� ������
	         head = grapic;  // head�� tail�� ���ο� ��带����Ŵ
	         tail = grapic;}
	      else {
	         tail.setNext(grapic); // tail�� ���ο� ��带 �����ϰ�,
	         tail = grapic;}       // tail�� ���� ������� ��带 ����Ű�� �� 
	}
	
	//���� �޼���
	private boolean delete(int index) {
		boolean flag = true; //�ش� �޼����� ��ȯ Ÿ���� boolean�̹Ƿ� �߰��� ����, false�� ��� ���� ���� 
	    Shape now = head;    //���� ���
	    Shape tmp = head;
	      
	    //���ʿ� ��尡 ���� ���
    	if (head == null)
    		return false;
	    
	    //ù��° Node�� ������ ��� 
	    if(index == 0) { 
	    	//��尡 �Ѱ� �ϰ�� 
	    	if(head == tail) { 
	    		head = null;
	            tail = null; }
	        //��尡 �ΰ� �̻�
	        else 
	            head = head.getNext(); }
	    
	    //����� �̵� 
	    for(int i=1; i<=index; i++) {
	    	tmp = now;               // ���� ��带 ���� �� 
	    	now = now.getNext();     // ���� ���� �̵�, tmp�� ���� ��带 �����ϰ� �� 
	         
	        //��� ���� �Է� ������ ������ -> ��������
	        if(now == null) {
	        	return false;		}}
	      
	        //�� ��带 ����ų��
	        if(now==tail) { 
	        	tmp.setNext(null);  //now���� ���� 
	        	tail = tmp;	}		//��� tmp��尡 tail�� ��
	        else 					//����尡 �ƴ϶�� ������尡 ���� ��带 ����Ŵ (��, ���� ��� now ����)
	        	tmp.setNext(now.getNext()); 
	      
	    return flag; 
	   }

	//��� �޼��� 
	public void print() {
		Shape tmp = head;
		
		//����� ������ ���ٸ� >> ���� ó��
		if(tmp==null) 
			System.out.println("����� ������ �����ϴ�.");
		else {
			while(true) {
				tmp.draw();
				if (tmp==tail)	return;   //����� ������ tail�϶����� �ݺ� 
				tmp = tmp.getNext();}
			}
		System.out.println();	}
}


public class HW2_Practice5_12 {
	public static void main(String[] args) {
		GraphicEditor ge = new GraphicEditor("beauty");
		ge.run();
	}
}
