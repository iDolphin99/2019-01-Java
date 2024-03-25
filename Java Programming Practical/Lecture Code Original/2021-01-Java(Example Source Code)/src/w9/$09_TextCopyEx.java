/*
 ���� ��Ʈ�� FileReader�� FileWriter�� �̿��Ͽ� c:\windows\system.ini�� c:\Temp\system.txt 
 ���Ϸ� �����ϴ� ���α׷��� �ۼ��϶�.
 */


package w9;

import java.io.*;

public class $09_TextCopyEx {

	public static void main(String[] args) {
		// ���� ���� ��θ�
		// ���� ���� ��θ�
		File src = new File("./test.txt");
		File dest = new File("./test2.txt");

		int c;
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest);
			
			// �� ���ھ� �а� ���� 
			while ((c=fr.read()) != -1)
				fw.write((char)c);
			
			fw.close();
			fr.close();
			System.out.println("������ �����Ͽ����ϴ�.");
		}
		catch (IOException e) {
			System.out.println("����� ����");
		}
		
	}

}
