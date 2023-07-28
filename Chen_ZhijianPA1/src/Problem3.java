import java.util.*;

public class Problem3 {

	public static void main(String[] args) {
		Scanner biu = new Scanner(System.in);
		System.out.print("What is your Number: ");
		int num = biu.nextInt();
		String rM = "";
		if (1 < num || num < 4999) {
			while (num >= 1000) {
				rM += "M";
				num -= 1000;
			}
			while (num >= 900) {
				rM += "CM";
				num -= 900;
			}
			while (num >= 500) {
				rM += "D";
				num -=500;
			}
			while (num >= 400) {
				rM += "CD";
				num -= 400;
			}
			while (num >= 100) {
				rM += "C";
				num -= 100;
			}
			while (num >= 90) {
				rM += "XC";
				num -= 90;
			}
			while (num >= 50) {
				rM += "L";
				num -=50;
			}
			while (num >= 40) {
				rM += "XL";
				num -= 40;
			}
			while (num >= 10) {
				rM += "X";
				num -= 10;
			}
			while (num >= 9) {
				rM += "IX";
				num -=9;
			}
			while (num >= 5) {
				rM += "V";
				num -= 5;
			}
			while (num >= 4) {
				rM += "IV";
				num -= 4;
			}
			while (num >= 1) {
				rM += "I";
				num -= 1;
			}
			System.out.print(rM);
		}

	}

}
