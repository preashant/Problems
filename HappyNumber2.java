package Problems;

public class HappyNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5856;

		int a = 0;
		while (true) {
			int sum = 0;
			int temp = num;
			while (temp > 0) {
				int s = temp % 10;
				int sq = s * s;
				sum += sq;
				temp /= 10;
				num = sum;
				System.out.println(num);
			}
			if (num == 1) {
				System.out.println("Happy Number");
				break;
			} else if (num == 4) {
				System.out.println("Not Happy Number");
				break;

			}

		}
	}

}
