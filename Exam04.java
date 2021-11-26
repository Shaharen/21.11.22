
public class Exam04 {

	public static void main(String[] args) {
		// 2 ~ 9단 == 다중 for 문
		for (int i = 2; i <= 9; i++) {
			System.out.println("===== " + i + "단" + " =====");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + " = " + (i * j));
			}

		}

		// 2 5 8 // 3 6 9 // 4 7 옆으로 출력
		for (int i = 2; i <= 4; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i % 3 == 2) {
					System.out.println(i + "*" + j + " = " + (i * j) + "   " + (i + 3) + "*" + j + " = " + ((i + 3) * j)
							+ "     " + (i + 6) + "*" + j + " = " + ((i + 6) * j));
				} else if (i % 3 == 0) {
					System.out.println(i + "*" + j + " = " + (i * j) + "   " + (i + 3) + "*" + j + " = " + ((i + 3) * j)
							+ "     " + (i + 6) + "*" + j + " = " + ((i + 6) * j));
				} else {
					System.out
							.println(i + "*" + j + " = " + (i * j) + "   " + (i + 3) + "*" + j + " = " + ((i + 3) * j));
				}

			}

		}

	}

}
