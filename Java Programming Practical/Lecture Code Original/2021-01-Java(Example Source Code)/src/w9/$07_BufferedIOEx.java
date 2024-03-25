/*
 ���� ũ�⸦ 5�� �ϰ�, ǥ�� ��� ��Ʈ��(System.out)�� ������ ���� ��� ��Ʈ���� �����϶�. 
 c:\Temp\test2.txt ������ ����� �ؽ�Ʈ�� �о� ���� ��� ��Ʈ���� ���� ����϶�.
 */


package w9;

import java.util.Scanner;
import java.io.*;

public class $07_BufferedIOEx {

	public static void main(String[] args) {
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("./test2.txt");
			BufferedOutputStream out = new BufferedOutputStream(System.out, 5); // ȭ�鿡 ����ϰڴٴ� �� System.out
			
			while((c=fin.read()) != -1) 
				out.write(c);
			
			// ���۰� �� ���� ���ڰ� ȭ�鿡 ��µȴ� 
			// ��� ��Ʈ���� ���� ũ�Ⱑ 5�̹Ƿ� 5���� ���ڸ� ��µ� 
			// ���ۿ� ���� �ִ� ��� ���ڸ� ����ϱ� ���� 
			// ����Ű�� �Է������ν� ���ۿ� ���� �ִ� ���ڸ� �� ������ ����� 
			new Scanner(System.in).nextLine();
			out.flush();
			
			fin.close();
			out.close();
		}
		catch (IOException e) {
			System.out.println("����� ����");
		}

	}

}
