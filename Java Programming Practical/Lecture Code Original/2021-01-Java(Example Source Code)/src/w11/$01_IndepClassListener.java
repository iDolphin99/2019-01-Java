package w11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class $01_IndepClassListener extends JFrame{
	// ������ �޼��� 
	public $01_IndepClassListener() {
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// ��ư �����ϰ� �̺�Ʈ �޾��ֱ� 
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		setSize(350,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new $01_IndepClassListener();}
}

class MyActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action"))
			b.setText("�׼�");
		else 
			b.setText("Action");
	}
}
