package level2;

public class MaxFrom3PstvNo {

	public static void main(String[] args) {

		minNum(10, 200, 30);
		minNum(10, 0, 30);
		minNum(-10, 0, 3);
		maxNum(10,20,90);
		maxNum(10,-20,90);
		maxNum(100,020, 90);
	}

	public static void minNum(int a, int b, int c) {

		int min = 0;
		while (a > 0 && b > 0 && c > 0) {
			a--;
			b--;
			c--;
			min++;

		}

		System.out.println(min);

	}
	
	
	public static void maxNum(int a, int b, int c) {

		int max = 0;
		while (a > 0 || b > 0 || c > 0) {
			a--;
			b--;
			c--;
			max++;

		}

		System.out.println(max);

	}

}
