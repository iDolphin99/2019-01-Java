/*
 ���콺�� ���ڿ� �̵���Ű�� - ���콺 �̺�Ʈ ���� 
 ����Ʈ���� �ƹ� ��ġ�� ���콺 ��ư�� ������ ���콺 ����Ʈ�� �ִ� ��ġ�� 
 "hello" ���ڿ��� �ű�� ���� �������α׷��� �ۼ��϶�
 
 ���� Ŭ������ ���� 
 */


package w11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class $04_MouseListenerEx extends JFrame{
	private JLabel label = new JLabel("Hello!");
	
	public $04_MouseListenerEx() {
		setTitle("Mouse �̺�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		
		c.setLayout(null);
		label.setSize(50,20);
		label.setLocation(30,30);
		c.add(label);
		
		setSize(500,500);
		setVisible(true);
	}
	
	private class MyMouseListener implements MouseListener {
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			label.setLocation(x,y);}
		
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}
	
	public static void main(String[] args) {
		new $04_MouseListenerEx();
	}
}
