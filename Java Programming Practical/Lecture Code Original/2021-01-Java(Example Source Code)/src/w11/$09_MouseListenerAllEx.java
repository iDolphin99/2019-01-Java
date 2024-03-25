// ���콺�� ���콺 ��� �̺�Ʈ Ȱ��

package w11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class $09_MouseListenerAllEx extends JFrame {
	private JLabel label = new JLabel("No Mouse Event");
	
	public $09_MouseListenerAllEx() {
		setTitle("MouseListener ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// �ΰ��� �����ʸ� ����϶� 
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		
		c.add(label);
		
		setSize(500,500);
		setVisible(true);
		
		//c.setFocusable(true);
		//c.requestFocus();
	}
	
	class MyMouseListener implements MouseListener, MouseMotionListener {
		public void mousePressed(MouseEvent e) {
			label.setText("mousePressed ("+e.getX()+", "+e.getY ()+")");}
		public void mouseReleased(MouseEvent e) {
			label.setText("mouseReleased ("+e.getX()+", "+e.getY ()+")");}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {
			Container c = (Container)e.getSource();
			c.setBackground(Color.CYAN);}
		public void mouseExited(MouseEvent e) {
			Container c = (Container)e.getSource();
			c.setBackground(Color.YELLOW);}
		public void mouseDragged(MouseEvent e) {
			label.setText("mouseDragged ("+e.getX()+", "+e.getY ()+")");
		}
		public void mouseMoved(MouseEvent e) {
			label.setText("mouseMoved ("+e.getX()+", "+e.getY ()+")");}
	}
	
	public static void main(String[] args) {
		new $09_MouseListenerAllEx();
	}

}
