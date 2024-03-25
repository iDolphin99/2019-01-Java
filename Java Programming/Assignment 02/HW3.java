/*
** ���α׷� ���� ��, "phoneNum.txt" ���Ͽ��� �̸��� ��ȭ��ȣ�� ���پ� �о �÷��ǿ� �߰��ϰ�, 
ȭ�� ��� (���� ���� �ÿ��� ������ ���� ���̱� ������ �̸��� ��ȭ��ȣ ���� ����)

** �÷��ǿ� ��ü �߰� ��, ���� ����(�̸���)�� �ǵ��� �� �� 

** ���α׷� ���� ��, �÷����� ��ȸ�ϸ鼭 �̸�\t��ȭ��ȣ "phoneNum.txt" ���� ����
 */


package Report02;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class HW3 {	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		String name; String phonenumber;						// �̸�, ��ȭ��ȣ 
		boolean flag = false;									// ��ȭ��ȣ ���� ���α׷� ����, true -> ���� 
		Map<String, String> dic = new TreeMap<String, String>();// TreeMap�� put �޼��带 �̿��� ���� �����ϸ� �ڵ����� key���� �������� ������
		
		System.out.println("<< ��ȭ��ȣ ���� ���α׷� ���� >>");
		
		
		/**********************"phoneNum.txt ���Ͽ��� �а� ���****************************/
		try {
			File file = new File("./phoneNum.txt");
			BufferedReader bfr = new BufferedReader(new FileReader(file));
			String line = "";
			System.out.println("[�̸�] \t[��ȭ��ȣ]");
			while((line = bfr.readLine()) != null) { 			// ���� �� �����Ͱ� ����������, �� �پ� �б� 
				System.out.println(line);
				String[] strArray = line.split("\t");			// "\t"�� �������� �̸��� ��ȭ��ȣ�� �÷��ǿ� �߰�
				dic.put(strArray[0],strArray[1]);}
			bfr.close();
		} catch (IOException e) {
			System.out.println("����� ����");}
		
		
		while(!flag) {
			System.out.println("\n\n1.�߰� 2.���� 3.���� 4.�˻� 5.���� : ");
			int op = sc.nextInt();								// 1~5������ option�� ���� 
			switch(op) {
				/****************************** ������ �߰� *****************************/
				case 1:
					System.out.println("\n�̸� �Է�:");
					name = sc.next();
					System.out.println("��ȭ��ȣ �Է�:");
					phonenumber = sc.next();
					dic.put(name, phonenumber);					// �÷��ǿ� ��ü �߰� ��, ���� ����(�̸���)���� �ڵ� ���ĵ� 
					
					// ��ü ���
					System.out.println("[�̸�] \t[��ȭ��ȣ]");
					for(String key : dic.keySet()){	 
			            String value = dic.get(key);		 
			            System.out.println(key+" \t"+value);}
					
					break;
				
				/****************************** ������ ���� *****************************/
				case 2: 
					System.out.println("\n������ �̸� �Է�:");
					name = sc.next();
					
					// ������ ����
					if (dic.containsKey(name))
						dic.remove(name);
					// ����ó�� -> ������ �� ����, �������� �ʴ� �̸��� ���
					else
						System.out.println("���� �̸��Դϴ�. \n\n");
					
					// ��ü ���
					System.out.println("[�̸�] \t[��ȭ��ȣ]");
					for(String key : dic.keySet()){	 
			            String value = dic.get(key);		 
			            System.out.println(key+" \t"+value);}
					
					break;
				
				/****************************** ������ ���� *****************************/ 
				case 3: 
					System.out.println("\n������ �̸� �Է�:");
					name = sc.next();
					// ����ó�� -> ������ �� ����, �������� �ʴ� �̸��� ��� 
					if (!(dic.containsKey(name))) {
						System.out.println("���� �̸��Դϴ�.");
						break;}
					
					// ������ ����
					System.out.println("��ȭ��ȣ �Է�:");
					phonenumber = sc.next();
					dic.replace(name, phonenumber);
					
					// ��ü ���
					System.out.println("[�̸�] \t[��ȭ��ȣ]");
					for(String key : dic.keySet()){	 
			            String value = dic.get(key);		 
			            System.out.println(key+" \t"+value);}
					
					break;
				
				/****************************** ������ �˻� *****************************/
				case 4: 
					System.out.println("\n�˻��� �̸� �Է�:");
					name = sc.next();
					
					// ����ó�� -> �˻��� �� ����, �������� �ʴ� �̸��� ���
					if (!(dic.containsKey(name))) {
						System.out.println("���� �̸��Դϴ�."); break;}
					
					// ������ �˻�
					System.out.println(dic.get(name) +"\n\n");
					
					// ��ü ���
					System.out.println("[�̸�] \t[��ȭ��ȣ]");
					for(String key : dic.keySet()){	 
			            String value = dic.get(key);		 
			            System.out.println(key+" \t"+value);}
					
					break;
				
				/***************************** ���α׷� ���� *****************************/
				//flag = true�� ��� ��ȭ��ȣ ���� ���α׷� ����
				case 5: flag=true; break;
				
				// ���� ó�� -> ������ ��ȣ �̿��� ���ڸ� �Է��� ��� 
				default : System.out.println("�߸��� �Է��Դϴ�. \n\n");
			}
		}
		
		/******************************phoneNum.txt ���Ͽ� �Է�********************************/
		try {
			File f = new File("./phoneNum.txt");
			BufferedWriter bw = new BufferedWriter(new FileWriter(f)); 
			for(String key : dic.keySet()){			  // ��ü �÷����� ���鼭 key�κ��� value�� ��� �Է���
	            String value = dic.get(key);		 
	            bw.write(key + "\t" + value + "\n");} // �Ŀ� "\t"�� �������� ������ �а� �÷��ǿ� �����͸� �߰��ؾ� �� 
			bw.close();
		} catch(IOException e) {
			System.out.println("����� ����");}
		
		
		sc.close();
		System.out.println("\n\n���α׷� ����...");
	}
}
