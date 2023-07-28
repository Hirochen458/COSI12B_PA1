import java.util.*;

public class Problem4 {

	public static void main(String[] args) {
		Scanner biu = new Scanner(System.in);
		System.out.println("Your Message? ");
		String message = biu.nextLine();
		System.out.println("Encoding key? ");
		int key = biu.nextInt();
		String messageTwo = "";
		int length = message.length();
		char character;
		message = message.toUpperCase();
		for (int i = 0; i < length; i++) {
			character = message.charAt(i);
			int nextCharacter = character + key;
			if (character == ' ') {
				messageTwo += ' ';
			}else {
				if(nextCharacter > 90) {
					nextCharacter = nextCharacter - 90 + 64;
					messageTwo += (char)(nextCharacter);
				}else {
					messageTwo += (char) (character + key);
				}
			}
		}
		System.out.println("Your message: " + messageTwo);

	}

}
