// String Ŭ������ �پ��� �޼ҵ带 Ȱ���ϴ� ���� ���ƶ�. 

package w7;

public class $07_StringEx {

	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++");
		
		System.out.println(a + "�� ���̴� " + a.length()); // ���ڿ��� ����(����)
		System.out.println(a.contains("#") + "\n"); // ���ڿ� ���� ���� 
		
		a = a.concat(b); // ���ڿ� ���� 
		System.out.println(a + "\n");
		
		a = a.trim(); // ���ڿ� �� ���� ���� ����
		System.out.println(a + "\n");
		
		a = a.replace("C#", "Java"); // ���ڿ� ��ġ 
		System.out.println(a);

		String s[] = a.split(","); // ���ڿ� �и� 
		for (int i = 0; i<s.length; i++)
			System.out.println("�и��� ���ڿ�"+i+": "+s[i]);
		
		a = a.substring(5); // �κ� ���ڿ�, �ε��� 5���� ������ ���� ��Ʈ�� ���� 
		System.out.println("\n"+a+"\n");
		
		char c = a.charAt(2); // �ε����� ���ڿ��� ���ڿ� ���� 
		System.out.println(c);
	}

}
