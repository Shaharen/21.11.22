
public class Exam02 {

	public static void main(String[] args) {
		// 1���� 100���� ����ϸ鼭 ¦���϶� - �ٿ��� ������ ���
		// 1)
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(-i + " ");
			} else {
				System.out.print(i + " ");
			}
		}

		System.out.println("");

		// 2)
		for (int i = 1; i <= 100; i++) {
			switch (i % 2) {
			case 0:
				System.out.print(-i + " ");
				break;
			case 1:
				System.out.print(i + " ");
				break;
			}

		}

	}

}
