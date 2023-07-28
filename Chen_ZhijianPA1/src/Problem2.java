import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner biu = new Scanner(System.in);
		System.out.print("What is your Number: ");
		int num = biu.nextInt();
		int oldNum = num;
		int digit = 0; 
		while(num != 0) {
			num /= 10;
			digit++;
		}
		for (int i = 1; i <= digit; i++) {
			int firstNum = oldNum / (int)Math.pow(10, (digit - i));
			oldNum -= firstNum * Math.pow(10,(digit -i));
			System.out.println(firstNum);
		}

	}

}
