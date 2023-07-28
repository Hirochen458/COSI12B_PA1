import java.util.Scanner;
import java.util.*;

public class Problem5 {
	
	public static void main(String[] args) {
		Scanner biu = new Scanner(System.in);
		System.out.println("Your First? ");
		String first = biu.nextLine();
		System.out.println("Your Last? ");
		String last = biu.nextLine();
		char[] firstName = first.toCharArray();
		char[] lastName = last.toCharArray();
		char firstNameMid = Character.toLowerCase(firstName[0]);
		char newFirstName [] = new char [first.length()];
		for (int i = 0; i < first.length() - 1; i++) {
			newFirstName[i] = firstName[i + 1];
		}
		newFirstName[first.length() - 1] = firstNameMid;
		newFirstName[0] = Character.toUpperCase(newFirstName[0]);
		String newTrueFirstName = new String(newFirstName);
		
		char lastNameMid = Character.toLowerCase(lastName[0]);
		char newLastName[] = new char [last.length()];
		for (int k = 0; k < last.length() - 1; k++) {
			newLastName[k] = lastName[k + 1];
			
		}
		newLastName[last.length() - 1] = lastNameMid;
		newLastName[0] = Character.toUpperCase(newLastName[0]);
		String newTrueLastName = new String(newLastName);
		System.out.println(newTrueFirstName + "ay" +' '+ newTrueLastName + "ay");
	}

}
