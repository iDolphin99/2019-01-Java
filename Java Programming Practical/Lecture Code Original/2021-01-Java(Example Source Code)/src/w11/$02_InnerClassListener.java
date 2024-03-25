package w11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class $02_InnerClassListener extends JFrame{
	public $02_InnerClassListener() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		setSize(350,150);
		setVisible(true);
	}
	
	// Action �����ʸ� ���� Ŭ������ �ۼ�
	// private�� �����Ͽ� �ش� Ŭ���� �ܺο��� ����� �� ���� �� 
	// ������ �ȿ����� �ش� Ŭ������ ����� ���� ������ �����ϰ� �� 
	private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) { 
			JButton b = (JButton)e.getSource();
			
			if (b.getText().equals("Action"))
				b.setText("�׼�");
			else
				b.setText("Action");
			
			$02_InnerClassListener.this.setTitle(b.getText());}
	}
	
	public static void main(String[] args) {
		new $02_InnerClassListener();
	}

}
