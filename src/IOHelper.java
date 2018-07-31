import java.util.Scanner;

public class IOHelper {
	public static String ask(String s){
		Scanner in = new Scanner(System.in);
		System.out.printf(s);
		String output = null;
		output = in.nextLine();
		return output;
	}
}
