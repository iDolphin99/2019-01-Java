/*
 FileOutputStream�� �̿��Ͽ� byte [] �迭 �ӿ� ��� �ִ� ���̳ʸ� ����c:\Temp\test.out ���Ͽ� �����϶�. 
 �� ������ ���̳ʸ� ������ �ǹǷ� �޸������� �� �� ����. 
 �� ������ ���� 6���� FileInputStream�� �̿��Ͽ� �о�ٽ� ����Ѵ�.
 */


package w9;

import java.io.*;

public class $05_FileOutputStreamEx {

	public static void main(String[] args) {		
		byte b[] = {7,51,3,4,-1,24};

		try {
			FileOutputStream fin = new FileOutputStream("./test_bin.out");
			
			for (int i=0; i<b.length; i++)
				fin.write(b[i]);
			fin.close();
		}
		catch (IOException e) {
			System.out.println("����� ����");
		}
		System.out.println("���� ����");
	}

}
