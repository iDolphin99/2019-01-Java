/*
 "ȫ�浿/��ȭ/ȫ��/����/����" 
 ���ڿ��� '/'�� ���� ���ڷ� �Ͽ� ��ū�� �и��Ͽ� �� ��ū�� ����϶�. 
 */

package w7;

import java.util.StringTokenizer;

public class $09_StringTokenizerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("ȫ�浿/��ȭ/ȫ��/����/����", "/");
		
		while(st.hasMoreTokens()) // st -> ���� reference �ּ�, ���� ��ġ�� token�� �ִ°� 
			System.out.println(st.nextToken()); // ���� ��ġ�� token�� ���� �� ��ȯ�ϰ� ���� token�� ��ġ�� �����

	}
}
