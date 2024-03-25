/*
 ���� ������ 30, ���� ������ 40�ȼ��� �ϰ� LEFT�� ���� ��ġ�ϴ� FlowLayout ��ġ�����ڸ� ���� 
 ����Ʈ�ҿ� 5���� ��ư ������Ʈ�� ������ ���� �������α׷��� �ۼ��϶�.
 */
package w10;

import java.awt.*;
import javax.swing.*;

public class $03_FlowLayoutEx extends JFrame {
	public $03_FlowLayoutEx() {
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		
		c.add(new Button("add"));
		c.add(new Button("sub"));
		c.add(new Button("mul"));
		c.add(new Button("div"));
		c.add(new Button("Calculate"));
		
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new $03_FlowLayoutEx();

	}

}
