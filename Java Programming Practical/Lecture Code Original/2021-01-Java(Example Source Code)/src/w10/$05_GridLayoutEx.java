/*
 �Ʒ� ȭ��� ���� ����ڷκ��� �Է¹޴� ���� 
 ���� �������α׷��� �ۼ��϶�
 */

package w10;

import java.awt.*;
import javax.swing.*;

public class $05_GridLayoutEx extends JFrame{
	public $05_GridLayoutEx() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(4,2);
		grid.setVgap(5);
		
		Container c = getContentPane();
		c.setLayout(grid);
		
		c.add(new JLabel("�̸�"));
		c.add(new JTextField(""));
		c.add(new JLabel("�й�"));
		c.add(new JTextField(""));
		c.add(new JLabel("�а�"));
		c.add(new JTextField(""));
		c.add(new JLabel("����"));
		c.add(new JTextField(""));
		
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new $05_GridLayoutEx();
	}

}
