
public class Exam02 {

	public static void main(String[] args) {
		// 1에서 100까지 출력하면서 짝수일땐 - 붙여서 옆으로 출력
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
