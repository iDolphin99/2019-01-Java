// ����Ʈ ��Ʈ���� �̿��Ͽ� ���̳ʸ� ������ �����ϴ� ���α׷��� �ۼ��϶�


package w9;

import java.io.*;

public class $10_BinaryCopyEx {

	public static void main(String[] args) {
		File src = new File("");
		File dest = new File("");
		
		int c;
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			
			
			while ((c = fi.read()) != -1) 
				fo.write((byte)c);
			
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "��" + dest.getPath() + "�� �����Ͽ����ϴ�.");
		}
		catch (IOException e) {
			System.out.println("����� ����");
		}
	}

}
