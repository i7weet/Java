package lr2;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Input number: ");
	    int number = scanner.nextInt();
	    if (number % 5 == 2 && number % 7 == 1) {
	        System.out.println("Yes");
	    } else {
	    	System.out.println("No");
	    }
	    scanner.close();
	}
}
