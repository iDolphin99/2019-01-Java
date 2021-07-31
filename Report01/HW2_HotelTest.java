/* ���� Ŭ���� �ۼ�, 10���� ��ü �迭 ����, add()/show() �޼��� �ϼ� */

package Report01;

class Hotel {
	private class Room {
		int number;
		String client;

		// ���� Ŭ����
		public Room(int number, String client) {
			// ������ ����
			this.number = number; // �Ű����� number�� number �ʵ忡 ����
			this.client = client; // �Ű����� client�� client �ʵ忡 ����
		}
	}

	// Room ��ü �迭 ����, �ε��� 10���� ȣ�� 10�� ����
	Room[] rooms = new Room[10];

	public void add(int number, String client) {
		// �޼��� �ϼ�, ���� ��ȣ���� �ϳ� ���� �ε����� Room ��ü ����
		rooms[number - 1] = new Room(number, client);}

	public void show() {
		// �޼��� �ϼ�, �迭�� ��� ���Ҹ� ó������ �ϳ��� Room ���� r�� �����ϸ� �ݺ�
		for (Room r : rooms) {
			// ���� r�� null�� �ʱ�ȭ�Ǿ����� �ʴٸ� ���� ���� ���
			if (r != null)
				System.out.println(r.number + "�� ���� " + r.client + "�� �����߽��ϴ�.");
		}}
}

public class HW2_HotelTest {
	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		hotel.add(5, "ȣ����");
		hotel.add(7, "�浿��");
		hotel.show();
	}
}