/*/
 FileInputStream�� �̿��Ͽ� c:\Temp\test.out ����(5���� ������ ����)�� �о� byte [] �迭 �ӿ� �����ϰ� ȭ�鿡 ����϶�.
 */


package w9;

import java.io.*;

public class $06_FileInputStreamEx {

	public static void main(String[] args) {
		byte b[] = new byte [6];
		try {
			FileInputStream fin = new FileInputStream("./test_bin.out");
			
			int n=0, c;
			while ((c=fin.read())!= -1) {
				b[n] = (byte)c; 
				n++;}
			
			System.out.println("���� �迭�� ����մϴ�.");
			for (int i=0; i<b.length; i++)
				System.out.print(b[i] + " ");
			System.out.println();
			fin.close();
		}
		
		catch (IOException e) {
			System.out.println("���� ����� ����");
		}

	}

}
