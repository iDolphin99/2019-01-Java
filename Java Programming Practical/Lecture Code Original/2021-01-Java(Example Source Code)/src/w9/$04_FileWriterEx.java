// Scanner�� �̿��Ͽ� Ű���忡�� �Է¹��� �����͸� c:\Temp\test.txt ���Ͽ� �����ϴ� ���α׷��� �ۼ��϶�.


package w9;

import java.io.*;
import java.util.Scanner;

public class $04_FileWriterEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter fin = null;
		int c;
		try {
			fin = new FileWriter("./test.txt");
			while (true) {
				String line = sc.nextLine();
				if(line.length()==0)
					break;
				fin.write(line, 0, line.length());
				fin.write("\r\n", 0, 2);}
			fin.close();
			sc.close();
		}
		catch(IOException e) {
			System.out.println("����� ����");
		}

	}

}
