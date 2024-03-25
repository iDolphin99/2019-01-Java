// ���� 10�� 10KB ������ �а� ������ �����Ͽ� ������� ������ �����϶�
// block ����, �迭�� ��Ƽ� ó���ϴ� �� 
// ���� �𸣰ڴ� ���Ҹ����� 


package w9;

import java.io.*;

public class $11_BlockBinaryCopyEx {

	public static void main(String[] args) {
		File src = new File("");
		File dest = new File("");
		
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest); 
			
			// 10KB ���� ���� 
			byte [] buf = new byte [1024*10]; 
			
			while (true) {
				int n = fi.read(buf);	// ���� ũ�⸸ŭ �б�, n�� ���� ���� ����Ʈ 
				fo.write(buf, n, 0);	// buf[0] ���� n ����Ʈ ���� 
				if (n < buf.length)
					break;
			}
			
			
			fi.close();
			fo.close();
		}
		catch (IOException e) {
			System.out.println("����� ����");
		}
	}

}
