// InputStreamReader�� �̿��Ͽ� MS949 ���� �������� �ѱ� �ؽ�Ʈ ������ �а� ����϶�


package w9;

import java.io.*;

public class $02_FileReadHangulSuccess {

	public static void main(String[] args) {
		FileInputStream fin = null;
		InputStreamReader in = null;
		try {
			fin = new FileInputStream("");
			in = new InputStreamReader(fin, "MS949"); // UTF-8
			
			int c;
			System.out.println("���ڵ� ���� ������ " + in.getEncoding());
			while ((c = in.read()) != -1) 
				System.out.print(c);
			in.close();
			fin.close();
		}
		catch (IOException e) {
			System.out.println("����� ����");
		}
	}

}
