package Report01;

import java.util.Scanner;
import java.util.stream.Stream;

public class HW3_ch11_6 {

	public static void main(String[] args) {
		// ��Ʈ���� ���� �Է��� ���ڿ��� �޾Ƶ���
		Stream<String> kb = Stream.generate(() -> new Scanner(System.in).nextLine());
		// 5������ ���ڿ��� ���
		System.out.println(kb.limit(5).filter(s -> s.length() == 2).count());
	}

}