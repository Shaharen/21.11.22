
public class Exam07 {

	public static void main(String[] args) {
		// ����� 3 - 12345 �ε� ���������� �ٰ�
		// i + j = 5
		// 1)
		for (int j = 1; j <= 5; j++) {
			for (int i = 5 - j; i > 0; i--) {
				System.out.print(" ");
			}
			for (int k = j; k > 0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 2)
		for (int j = 0; j <= 4; j++) {
			for (int i = 1; i <= 5 - j; i++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= 1 + j; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
