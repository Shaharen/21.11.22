
public class Exam05 {

	public static void main(String[] args) {
		// 별찍기 12345
		// 1)
		for (int i = 1; i <= 5; i++) {
			for (; i >= 2;) {
				System.out.print("*");
				break;
			}
			for (; i >= 3;) {
				System.out.print("*");
				break;
			}
			for (; i >= 4;) {
				System.out.print("*");
				break;
			}
			for (; i >= 5;) {
				System.out.print("*");
				break;
			}
			System.out.print("*");
			System.out.println();

		}

		System.out.println();

		// 2) 1번 축소
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; i >= j; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		// 3) 2와 동일
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
