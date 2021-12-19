
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter a sentence");
		String sentence = in.nextLine();
		int cnt=0;
		boolean valid=true;
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == '(')
				cnt++;
			else if (sentence.charAt(i) == ')')
				cnt--;
			if (cnt<0) {
				valid=false;
				break;
			}
		}
		if (valid && cnt==0)
			System.out.println("the sentence is VALID");
		else
			System.out.println("the sentence is NOT VALID");

	}

}
