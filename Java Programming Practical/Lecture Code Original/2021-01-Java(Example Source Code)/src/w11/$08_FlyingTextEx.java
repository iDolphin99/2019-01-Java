/*
 * ��, ��, ��, �� Ű�� �̿��Ͽ� "HELLO" ���ڿ��� �����̴� �������α׷��� �ۼ��϶�.
  "HELLO" ���ڿ��� JLabel ������Ʈ�� ����� ����Ʈ�ҿ� �����ϰ� ��, ��, ��, �� Ű�� �����̸� 
    Ű �������� �� ���� 10�ȼ��� �����δ�. �̸� ���� ����Ʈ���� ��ġ�����ڸ� �����Ͽ����Ѵ�. 
  "HELLO" ���ڿ��� �ʱ⿡ (50, 50) ��ġ�� ����϶�.
   */

package w11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class $08_FlyingTextEx extends JFrame{
	private JLabel label = new JLabel("HELLO");
	
	public $08_FlyingTextEx() {
		setTitle("FlyingText ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		label.setLocation(50,50);
		label.setSize(100,20);
		c.add(label);
		
		c.addKeyListener(new MyKeyListener());
		
		setSize(500,500);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter{ 
		public void keyPressed(KeyEvent e) {
			Container contentPane = (Container)e.getSource();
			
			int keyCode = e.getKeyCode();
			
			switch(keyCode) {
			case KeyEvent.VK_UP :
				label.setLocation(label.getX(), label.getY()-10);	break;
			case KeyEvent.VK_DOWN :
				label.setLocation(label.getX(), label.getY()+10);	break;
			case KeyEvent.VK_LEFT :
				label.setLocation(label.getX()-10, label.getY());	break;
			case KeyEvent.VK_RIGHT :
				label.setLocation(label.getX()+10, label.getY());	break;	}}
	}
	
	public static void main(String[] args) {
		new $08_FlyingTextEx();
	}

}
