
public class Exam03 {

	public static void main(String[] args) {
		// for문을 사용하여 구구단 2단 출력

		for (int i = 1; i <= 9; i++) {
			System.out.println("2*" + i + " = " + (2 * i));
		}
		// 2 ~ 9 단
		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "단 입니다.");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + " = " + (i * j));
			}
		}

	}

}
