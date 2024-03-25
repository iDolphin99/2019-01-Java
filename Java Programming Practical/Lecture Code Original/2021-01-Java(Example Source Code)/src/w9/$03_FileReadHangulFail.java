// InputStreamReader�� ���� ������ US-ASCII�� �����Ͽ� �ѱ� ������ �а� ����϶�.


package w9;

import java.io.*;

public class $03_FileReadHangulFail {

	public static void main(String[] args) {
		FileInputStream fin = null;
		InputStreamReader in = null;
		
		try {
			fin = new FileInputStream("");
			in = new InputStreamReader(fin,"US-ASCII"); // ���� ���� ������ �߸��� ��� ����� �νĵ��� ���� (����!!) 
			
			int c;
			System.out.println("���ڵ� ���� ������ " + in.getEncoding());
			while ((c = in.read())!=-1) 
				System.out.print((char)c);
			
			in.close();
			fin.close();
		}
		catch (IOException e) {
			System.out.println("����� ����");
		}
	}

}
