package w11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class $03_AnonymousClassListener extends JFrame {
	public $03_AnonymousClassListener() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane(); 
		c.setLayout(new FlowLayout());
		
		// �͸� Ŭ������ �̺�Ʈ �����ʸ� ��������� 
		JButton btn = new JButton("Action");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
					b.setText("�׼�");
				else 
					b.setText("Action");
				setTitle(b.getText());}
		});
		c.add(btn);
		
		
		setSize(350,150);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new $03_AnonymousClassListener();	
		}
}
