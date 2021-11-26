
public class Exam01 {

	public static void main(String[] args) {
		// 1부터 100까지의 3의 배수의 총합 출력 (for문)

		// 1)
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);

		// 2)
		int sum2 = 0;

		for (int i = 3; i <= 100; i += 3) {
			sum2 = sum2 + i;
		}
		System.out.println(sum2);

		// 3)
		int sum3 = 0;

		for (int i = 0; true; sum3 = sum3 + i) {
			i += 3;
			if (i > 100) {
				break;
			}
		}
		System.out.println(sum3);

	}

}
