

import java.util.*;

public class Problem1 {

	public static void main(String[] args) {
		Scanner biu = new Scanner(System.in);
		System.out.println("Initial value is: ");
		int num = biu.nextInt();
		int totalTimes = 0;
		if(num > 1) {
			while(num > 1) {
				if(num == 2) {
					totalTimes +=1;
					num = num/2;
					System.out.println("Final value 1, number of operations performed: " + totalTimes);
				
				}else if(num % 2 == 0) {
					num = num/2;
					totalTimes +=1;
					System.out.println("Next value is: " + num);
				}else {
					num = num *3 + 1;
					totalTimes +=1;
					System.out.println("Next value is: " + num);
				}
			}
		}else {
			System.out.println("Error");
		}
	}

}
