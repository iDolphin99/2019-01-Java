/*
 ������ Wrapper Ŭ������ Ȱ���ϴ� ���̴�. ���� ���α׷��� ����� �����ΰ�? 
 */


package w7;

public class $05_WrapperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Character.toLowerCase('A')); // �ҹ��ڷ� ��ȯ 
		
		char c1 = '4', c2 = 'F';
		if(Character.isDigit(c1)) // �����ΰ�? 
			System.out.println(c1 + "�� ����");
		if(Character.isAlphabetic(c2)) // �������ΰ�? 
			System.out.println(c2 + "�� ������\n");
		
		System.out.println(Integer.parseInt("-123")); // ���������� -123�� 10���� ���·� 
		System.out.println(Integer.toHexString(28)); // ������ 16���� ���ڿ��� 
		System.out.println(Integer.toBinaryString(28)); // 2������ ���ڿ� �������� 
		System.out.println(Integer.bitCount(28) + "\n"); // 2������ �� 1�� ���� 
		
		Double d = Double.valueOf(3.14); // 3.14 -> Wrapper 
		System.out.println(d.toString()); // ���ڿ� �������� ��� 
		System.out.println(Double.parseDouble("3.14")); // ���ڿ��� �Ǽ��� ��� 
		
		boolean b = (4>3); 
		System.out.println(Boolean.toString(b)); // ���ڿ��� ��ȯ 
		System.out.println(Boolean.parseBoolean("false")); // ���ڿ��� Boolean �������� ��ȯ 
	}

}
