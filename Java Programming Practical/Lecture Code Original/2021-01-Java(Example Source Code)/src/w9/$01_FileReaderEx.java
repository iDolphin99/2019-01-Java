/*/
 FileReader�� �̿��Ͽ� c:\windows\system.ini ������ �о� ȭ�鿡 ����ϴ� ���α׷��� �ۼ��϶�. 
 system.ini�� �ؽ�Ʈ �����̴�.
 */


package w9;

import java.io.*;

public class $01_FileReaderEx {

	public static void main(String[] args) {
		FileReader fin = null;
		try {
			fin = new FileReader("c:\\windows\\system.ini");
			int c;
			while ((c = fin.read()) != -1) 
				System.out.print(c);
			fin.close();			
		} 
		catch(IOException e) {
			System.out.println("����� ����");
		}

	}

}
