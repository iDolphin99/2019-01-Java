// ���� �׸��� ���� ����Ʈ���� ������ ������������ �ϰ�
//�̰��� OK, Cancel, Ignore ��ư���� ������ ���� ���α׷��� �ۼ��϶�


package w10;

import java.awt.*;
import javax.swing.*;


public class $02_ContentPaneEx extends JFrame{
	public $02_ContentPaneEx() {
		super("ContentPan�� JFrame");
		// setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Frame�� �ݱ� ��ư�� ������ �� ���� ��������� ����ǵ��� �ϴ� ��ɾ� 
	
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout()); 	    // ��ġ ���� ��ü, ��->��
	
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancle"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new $02_ContentPaneEx();
	}

}
