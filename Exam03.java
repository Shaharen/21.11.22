
public class Exam03 {

	public static void main(String[] args) {
		// for���� ����Ͽ� ������ 2�� ���

		for (int i = 1; i <= 9; i++) {
			System.out.println("2*" + i + " = " + (2 * i));
		}
		// 2 ~ 9 ��
		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "�� �Դϴ�.");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + " = " + (i * j));
			}
		}

	}

}
